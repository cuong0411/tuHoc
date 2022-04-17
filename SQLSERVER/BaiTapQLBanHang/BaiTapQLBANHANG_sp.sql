--Stored procedure
use QLBANHANG2
GO

SELECT * FROM dbo.KHACHHANG
SELECT * FROM dbo.VATTU
SELECT * FROM dbo.HOADON
SELECT * FROM dbo.CTHD
-- 1.Lấy ra danh các khách hàng đã mua hàng trong ngày X, với X là tham số truyền vào.
CREATE PROC Cau1 @ngay INT
AS
    SELECT KHACHHANG.MAKH, TENKH, DIACHIKH, NGAY
    FROM dbo.KHACHHANG, dbo.HOADON
    WHERE KHACHHANG.MAKH = HOADON.MAKH
        AND DAY(NGAY) = @ngay
GO
EXEC dbo.Cau1 12
-- 2.Lấy ra danh sách khách hàng có tổng trị giá các đơn hàng lớn hơn X (X là tham số).
DROP PROC dbo.Cau2
CREATE PROC Cau2 @x INT
AS
    SELECT KHACHHANG.MAKH, SUM(SL * GIABAN) AS [TONG GIA TRI DON HANG]
    FROM dbo.KHACHHANG, dbo.HOADON, dbo.CTHD
    WHERE KHACHHANG.MAKH = HOADON.MAKH AND HOADON.MAHD = CTHD.MAHD
    GROUP BY KHACHHANG.MAKH
    HAVING SUM(SL * GIABAN) > @x
GO
EXEC dbo.Cau2 10000000
-- 3.Lấy ra danh sách X khách hàng có tổng trị giá các đơn hàng lớn nhất (X là tham số).
DROP PROC dbo.Cau3
CREATE PROC Cau3 @x INT
AS
    SELECT TOP(@x) KHACHHANG.MAKH, SUM(SL * GIABAN) AS [TONG GIA TRI DON HANG]
    FROM dbo.KHACHHANG, dbo.HOADON, dbo.CTHD
    WHERE KHACHHANG.MAKH = HOADON.MAKH AND HOADON.MAHD = CTHD.MAHD
    GROUP BY KHACHHANG.MAKH
    ORDER BY [TONG GIA TRI DON HANG] DESC
GO
EXEC dbo.Cau3 10
-- 4.Lấy ra danh sách X mặt hàng có số lượng bán lớn nhất (X là tham số).
CREATE PROC Cau4 @x INT
AS
    SELECT TOP(@x) VATTU.MAVT, TENVT, SL
    FROM dbo.VATTU, dbo.CTHD
    WHERE VATTU.MAVT = CTHD.MAVT
    ORDER BY SL DESC
GO
EXEC dbo.Cau4 8
-- 5.Lấy ra danh sách X mặt hàng bán ra có lãi ít nhất (X là tham số).
CREATE PROC Cau5 @x INT
AS
    SELECT TOP(@x) VATTU.MAVT, TENVT, (SL * (GIABAN - GIAMUA)) AS [LAI]
    FROM dbo.VATTU, dbo.CTHD
    WHERE VATTU.MAVT = CTHD.MAVT
    ORDER BY LAI ASC
GO
EXEC dbo.Cau5 5
-- 6.Lấy ra danh sách X đơn hàng có tổng trị giá lớn nhất (X là tham số).
CREATE PROC Cau6 @x INT
AS
    SELECT TOP(@x) HOADON.MAHD, SUM(SL*GIABAN) AS [TONG TRI GIA]
    FROM dbo.HOADON, dbo.CTHD
    WHERE HOADON.MAHD = CTHD.MAHD
    GROUP BY HOADON.MAHD
    ORDER BY [TONG TRI GIA] DESC
GO
EXEC dbo.Cau6 4
-- 7.Tính giá trị cho cột khuyến mãi như sau: Khuyến mãi 5% nếu SL > 100, 10% nếu SL > 500.
DROP PROC dbo.Cau7
CREATE PROC Cau7
AS
    SELECT IIF(SL > 500, 0.1, (IIF(SL > 100, 0.05, 0))) AS [KHUYEN MAI]
    FROM dbo.CTHD
GO
EXEC dbo.Cau7
-- 8.Tính lại số lượng tồn cho tất cả các mặt hàng (SLTON = SLTON – tổng SL bán được).
CREATE PROC Cau8
AS
    SELECT VATTU.MAVT, SLTON,
        IIF(SUM(SL) IS NOT NULL, SUM(SL), 0) AS [TONG SO LUONG BAN],
        (SLTON - IIF(SUM(SL) IS NOT NULL, SUM(SL), 0)) AS [SO LUONG TON CON LAI]
    FROM dbo.VATTU LEFT JOIN dbo.CTHD
    ON VATTU.MAVT = CTHD.MAVT
    GROUP BY VATTU.MAVT, SLTON
GO
EXEC dbo.Cau8
-- 9.Tính trị giá cho mỗi hóa đơn.
CREATE PROC Cau9
AS
    SELECT HOADON.MAHD,
        SUM(SL * GIABAN) AS [TRI GIA BAN],
        SUM(SL * GIABAN * (1 - IIF(SL > 500, 0.1, (IIF(SL > 100, 0.05, 0))))) AS [TRI GIA BAN SAU KHUYEN MAI]
    FROM dbo.HOADON, dbo.CTHD
    WHERE HOADON.MAHD = CTHD.MAHD
    GROUP BY HOADON.MAHD
GO
EXEC dbo.Cau9
-- 10.Tạo ra table KH_VIP có cấu trúc giống với cấu trúc table KHACHHANG.
--Lưu các khách hàng có tổng trị giá của tất cả các đơn hàng >=10,000,000 vào table KH_VIP.
DROP PROC dbo.Cau10
CREATE PROC Cau10 @x INT
AS
    DROP TABLE IF EXISTS KH_VIP
    SELECT *
    INTO KH_VIP
    FROM dbo.KHACHHANG
    WHERE MAKH IN
    (
        SELECT KHACHHANG.MAKH
        FROM dbo.KHACHHANG, dbo.HOADON, dbo.CTHD
        WHERE KHACHHANG.MAKH = HOADON.MAKH AND HOADON.MAHD = CTHD.MAHD
        GROUP BY KHACHHANG.MAKH
        HAVING SUM(SL * GIABAN) > @x
    )
GO
EXEC dbo.Cau10 10000000
SELECT * FROM dbo.KH_VIP