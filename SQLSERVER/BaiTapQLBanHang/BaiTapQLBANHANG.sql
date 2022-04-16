use QLBANHANG2
go

SELECT * FROM dbo.KHACHHANG
SELECT * FROM dbo.VATTU
SELECT * FROM dbo.HOADON
SELECT * FROM dbo.CTHD
go
--TAO VIEW

--1.Hiển thị danh sách các khách hàng có địa chỉ là “Tân Bình”
--gồm mã khách hàng, tên khách hàng, địa chỉ, điện thoại, và địa chỉ E-mail.
CREATE VIEW KH_TANBINH
AS
	SELECT * FROM DBO.KHACHHANG
	WHERE DIACHIKH = N'Tân Bình'
GO
--2.Hiển thị danh sách các khách hàng gồm các thông tin mã khách hàng,
--tên khách hàng, địa chỉ và địa chỉ E-mail của những khách hàng chưa có số điện thoại.
CREATE VIEW KH_CHUA_CO_SDT
AS
	SELECT MAKH, TENKH, DIACHIKH, EMAIL
	FROM DBO.KHACHHANG
	WHERE DT IS NULL
GO
-- 3.Hiển thị danh sách các khách hàng chưa có số điện thoại và cũng chưa có địa chỉ Email
-- gồm mã khách hàng, tên khách hàng, địa chỉ.
CREATE VIEW KH_CHUA_CO_SDT_EMAIL
AS
	SELECT MAKH, TENKH, DIACHIKH
	FROM dbo.KHACHHANG
	WHERE DT IS NULL AND EMAIL IS NULL
GO
-- 4.Hiển thị danh sách các khách hàng đã có số điện thoại và địa chỉ E-mail
-- gồm mã khách hàng, tên khách hàng, địa chỉ, điện thoại, và địa chỉ E-mail.
CREATE VIEW KH_DA_CO_SDT_EMAIL
AS
	SELECT MAKH, TENKH, DIACHIKH, DT, EMAIL
	FROM dbo.KHACHHANG
	WHERE DT IS NOT NULL AND EMAIL IS NOT NULL
GO
-- 5.Hiển thị danh sách các vật tư có đơn vị tính là “Cái”
-- gồm mã vật tư, tên vật tư và giá mua.
CREATE VIEW VATTU_DVT_CAI
AS
	SELECT MAVT, TENVT, GIAMUA
	FROM dbo.VATTU
	WHERE DVT = N'Cái'
GO
-- 6.Hiển thị danh sách các vật tư gồm
-- mã vật tư, tên vật tư, đơn vị tính và giá mua mà có giá mua trên 25000.
SELECT MAVT, TENVT, DVT, GIAMUA
FROM dbo.VATTU
WHERE GIAMUA > 25000
go
-- 7.Hiển thị danh sách các vật tư là “Gạch” (bao gồm các loại gạch)
-- gồm mã vật tư, tên vật tư, đơn vị tính và giá mua.
SELECT MAVT, TENVT, DVT, GIAMUA
FROM dbo.VATTU
WHERE TENVT LIKE N'%Gạch%'
go
-- 8.Hiển thị danh sách các vật tư gồm
-- mã vật tư, tên vật tư, đơn vị tính
-- và giá mua mà có giá mua nằm trong khoảng từ 20000 đến 40000.
SELECT MAVT, TENVT, DVT, GIAMUA
FROM dbo.VATTU
WHERE GIAMUA >= 20000 and GIAMUA <= 40000
GO
-- 9.Lấy ra các thông tin gồm Mã hóa đơn, ngày lập hóa đơn,
-- tên khách hàng, địa chỉ khách hàng
-- và số điện thoại.
SELECT MAHD, NGAY, TENKH, DIACHIKH, DT
FROM dbo.HOADON, dbo.KHACHHANG
WHERE HOADON.MAKH = KHACHHANG.MAKH
go
-- 10.Lấy ra các thông tin gồm Mã hóa đơn, tên khách hàng,
-- địa chỉ khách hàng và số điện thoại của ngày 25/5/2010.
SELECT MAHD, TENKH, DIACHIKH, DT, NGAY
FROM dbo.HOADON, dbo.KHACHHANG
WHERE HOADON.MAKH = KHACHHANG.MAKH
	and NGAY = '2010-5-25'
GO
-- 11.Lấy ra các thông tin gồm Mã hóa đơn, ngày lập hóa đơn, tên khách hàng, địa chỉ khách hàng
-- và số điện thoại của những hóa đơn trong tháng 6/2010.
SELECT MAHD, NGAY, TENKH, DIACHIKH, DT
FROM dbo.HOADON, dbo.KHACHHANG
WHERE HOADON.MAKH = KHACHHANG.MAKH
	AND MONTH(NGAY) = 6
-- 12.Lấy ra danh sách những khách hàng (tên khách hàng, địa chỉ, số điện thoại)
-- đã mua hàng trong tháng 6/2010.
SELECT TENKH, DIACHIKH, DT
FROM dbo.HOADON, dbo.KHACHHANG
WHERE HOADON.MAKH = KHACHHANG.MAKH
	AND MONTH(NGAY) = 6
-- 13.Lấy ra danh sách những khách hàng không mua hàng trong tháng 6/2010 gồm
-- các thông tin tên khách hàng, địa chỉ, số điện thoại.
SELECT TENKH, DIACHIKH, DT
FROM dbo.HOADON, dbo.KHACHHANG
WHERE HOADON.MAKH = KHACHHANG.MAKH
	AND MONTH(NGAY) != 6
-- 14.Lấy ra các chi tiết hóa đơn gồm
-- các thông tin mã hóa đơn, mã vật tư, tên vật tư, đơn vị tính, giá bán, giá mua,
-- số lượng, trị giá mua (giá mua * số lượng), trị giá bán (giá bán * số lượng).
SELECT CTHD.MAHD, CTHD.MAVT, TENVT, DVT, GIABAN, GIAMUA, SL,
	GIAMUA * SL AS TRIGIAMUA, GIABAN * SL AS TRIGIABAN
FROM dbo.VATTU, dbo.HOADON, dbo.CTHD
WHERE CTHD.MAHD = HOADON.MAHD AND CTHD.MAVT = VATTU.MAVT
-- 15.Lấy ra các chi tiết hóa đơn gồm các thông tin mã hóa đơn,
-- mã vật tư, tên vật tư, đơn vị tính, giá bán, giá mua,
-- số lượng, trị giá mua (giá mua * số lượng),
-- trị giá bán (giá bán * số lượng) mà có giá bán lớn hơn hoặc bằng giá mua.
SELECT CTHD.MAHD, CTHD.MAVT, TENVT, DVT, GIABAN, GIAMUA, SL,
	GIAMUA * SL AS TRIGIAMUA, GIABAN * SL AS TRIGIABAN
FROM dbo.VATTU, dbo.HOADON, dbo.CTHD
WHERE CTHD.MAHD = HOADON.MAHD AND CTHD.MAVT = VATTU.MAVT
	AND GIABAN >= GIAMUA
-- 16.Lấy ra các thông tin gồm mã hóa đơn, mã vật tư, tên vật tư, đơn vị tính, giá bán,
-- giá mua, số lượng, trị giá mua (giá mua * số lượng),
-- trị giá bán (giá bán * số lượng) và
-- cột khuyến mãi với khuyến mãi 10% cho những mặt hàng bán trong một hóa đơn lớn hơn 100.
SELECT CTHD.MAHD, CTHD.MAVT, TENVT, DVT, GIABAN, GIAMUA, SL,
	GIAMUA * SL AS TRIGIAMUA, GIABAN * SL AS TRIGIABAN,
	KHUYENMAI = CASE
		WHEN SL > 100 THEN 0.1 -- 10%
		ELSE NULL
	END
FROM dbo.VATTU, dbo.HOADON, dbo.CTHD
WHERE CTHD.MAHD = HOADON.MAHD AND CTHD.MAVT = VATTU.MAVT
-- 17.Tìm ra những mặt hàng chưa bán được.
SELECT *
FROM dbo.VATTU
WHERE VATTU.MAVT NOT IN (SELECT MAVT FROM dbo.CTHD)
-- 18.Tạo bảng tổng hợp gồm các thông tin: mã hóa đơn, ngày hóa đơn, tên khách hàng,
-- địa chỉ, số điện thoại, tên vật tư, đơn vị tính, giá mua, giá bán,
-- số lượng, trị giá mua, trị giá bán.
CREATE VIEW BangTongHop
AS
	SELECT
		HOADON.MAHD, NGAY, TENKH, DIACHIKH, DT, TENVT, DVT, GIAMUA, GIABAN,
		SL, GIAMUA * SL AS TRIGIAMUA, GIABAN * SL AS TRIGIABAN
	FROM dbo.HOADON, dbo.KHACHHANG, dbo.VATTU, dbo.CTHD
	WHERE KHACHHANG.MAKH = HOADON.MAKH
		AND CTHD.MAHD = HOADON.MAHD
		AND CTHD.MAVT = VATTU.MAVT
GO
SELECT * FROM BangTongHop
-- 19.Tạo bảng tổng hợp tháng 5/2010 gồm các thông tin: mã hóa đơn, ngày hóa đơn,
-- tên khách hàng, địa chỉ, số điện thoại, tên vật tư, đơn vị tính, giá mua,
-- giá bán, số lượng, trị giá mua, trị giá bán.
SELECT *
FROM BangTongHop
WHERE MONTH(NGAY) = 5
	AND YEAR(NGAY) = 2010
-- 20.Tạo bảng tổng hợp quý 1 – 2010 gồm các thông tin:
-- mã hóa đơn, ngày hóa đơn, tên khách hàng, địa chỉ, số điện thoại,
-- tên vật tư, đơn vị tính, giá mua, giá bán, số lượng, trị giá mua, trị giá bán.
SELECT *
FROM BangTongHop
WHERE MONTH(NGAY) IN (1, 2, 3)
	AND YEAR(NGAY) = 2010
-- 21.Lấy ra danh sách các hóa đơn gồm các thông tin: Số hóa đơn, ngày,
-- tên khách hàng, địa chỉ khách hàng, tổng trị giá của hóa đơn.
SELECT HOADON.MAHD, NGAY, TENKH, DIACHIKH, SUM(GIABAN * SL) AS TONGGIABAN
FROM dbo.HOADON, dbo.KHACHHANG, dbo.CTHD
	WHERE KHACHHANG.MAKH = HOADON.MAKH
		AND CTHD.MAHD = HOADON.MAHD
GROUP BY HOADON.MAHD, NGAY, TENKH, DIACHIKH

CREATE VIEW CAU21
AS

	SELECT MAHD, NGAY, TENKH, DIACHIKH, SUM(GIABAN * SL) AS TONGGIABAN
	FROM BangTongHop
	GROUP BY MAHD, NGAY, TENKH, DIACHIKH
GO
SELECT * FROM CAU21
-- 22.Lấy ra hóa đơn có tổng trị giá lớn nhất gồm các thông tin:
-- Số hóa đơn, ngày, tên khách hàng, địa chỉ khách hàng, tổng trị giá của hóa đơn.
SELECT TOP (1) HOADON.MAHD, NGAY, TENKH, DIACHIKH, SUM(GIABAN * SL) AS TONGGIABAN
FROM dbo.HOADON, dbo.KHACHHANG, dbo.CTHD
	WHERE KHACHHANG.MAKH = HOADON.MAKH
		AND CTHD.MAHD = HOADON.MAHD
GROUP BY HOADON.MAHD, NGAY, TENKH, DIACHIKH
ORDER BY TONGGIABAN DESC

SELECT TOP(1) MAHD, NGAY, TENKH, DIACHIKH, SUM(GIABAN * SL) AS TONGGIABAN
FROM BangTongHop
GROUP BY MAHD, NGAY, TENKH, DIACHIKH
ORDER BY TONGGIABAN DESC

SELECT MAHD, NGAY, TENKH, DIACHIKH, TONGGIABAN
FROM CAU21
WHERE TONGGIABAN = (SELECT MAX(TONGGIABAN) FROM CAU21)
-- 23.Lấy ra hóa đơn có tổng trị giá lớn nhất trong tháng 5/2010 gồm
-- các thông tin: Số hóa đơn, ngày, tên khách hàng, địa chỉ khách hàng, tổng trị giá của hóa đơn.
SELECT MAHD, NGAY, TENKH, DIACHIKH, TONGGIABAN
FROM CAU21
WHERE TONGGIABAN =
(
	SELECT MAX(TONGGIABAN) FROM CAU21
	WHERE YEAR(NGAY) = 2010 AND MONTH(NGAY) = 5
)
-- 24.Đếm xem mỗi khách hàng có bao nhiêu hóa đơn.
CREATE VIEW CAU24
AS
	SELECT TENKH, COUNT(MAHD) AS [SOLUONGHOADON]
	FROM dbo.KHACHHANG, dbo.HOADON
	WHERE KHACHHANG.MAKH = HOADON.MAKH
	GROUP BY TENKH
GO
SELECT * FROM CAU24
-- 25.Đếm xem mỗi khách hàng, mỗi tháng có bao nhiêu hóa đơn.
SELECT TENKH, MONTH(NGAY) AS THANG, COUNT(MAHD) AS [SOLUONGHOADON]
FROM dbo.KHACHHANG, dbo.HOADON
WHERE KHACHHANG.MAKH = HOADON.MAKH
GROUP BY TENKH, MONTH(NGAY)
-- 26.Lấy ra các thông tin của khách hàng có số lượng hóa đơn mua hàng nhiều nhất.
CREATE VIEW TONGSOLUONGHOADON
AS
	SELECT KHACHHANG.MAKH, COUNT(MAHD) AS [SOLUONGHOADON]
		FROM dbo.KHACHHANG, dbo.HOADON
		WHERE KHACHHANG.MAKH = HOADON.MAKH
		GROUP BY KHACHHANG.MAKH
GO
SELECT * FROM TONGSOLUONGHOADON

SELECT *
FROM dbo.KHACHHANG
WHERE MAKH = (
	SELECT MAKH FROM TONGSOLUONGHOADON WHERE SOLUONGHOADON =
		(SELECT MAX(SOLUONGHOADON) FROM TONGSOLUONGHOADON))
-- 27.Lấy ra các thông tin của khách hàng có số lượng hàng mua nhiều nhất.
DROP VIEW TONGSLHANGHOA
CREATE VIEW TONGSLHANGHOA
AS
	SELECT
			KHACHHANG.MAKH, SUM(SL) AS SLHANGHOA
		FROM dbo.HOADON, dbo.KHACHHANG, dbo.VATTU, dbo.CTHD
		WHERE KHACHHANG.MAKH = HOADON.MAKH
			AND CTHD.MAHD = HOADON.MAHD
			AND CTHD.MAVT = VATTU.MAVT
		GROUP BY KHACHHANG.MAKH
GO
SELECT * FROM TONGSLHANGHOA

SELECT *
FROM dbo.KHACHHANG
WHERE MAKH = (
		SELECT MAKH
FROM TONGSLHANGHOA
WHERE SLHANGHOA = (SELECT MAX(SLHANGHOA)
FROM TONGSLHANGHOA)
		)
-- 28.Lấy ra các thông tin về các mặt hàng mà được bán trong nhiều hóa đơn nhất.

CREATE VIEW BangTongHopVatTu
AS
	SELECT VATTU.MAVT, HOADON.MAHD, SL
	FROM dbo.HOADON, dbo.KHACHHANG, dbo.VATTU, dbo.CTHD
	WHERE KHACHHANG.MAKH = HOADON.MAKH
		AND CTHD.MAHD = HOADON.MAHD
		AND CTHD.MAVT = VATTU.MAVT
GO
SELECT * FROM BangTongHopVatTu

CREATE VIEW SLVATTU_HD
AS
	SELECT MAVT, COUNT(MAHD) AS SLHOADON
	FROM BangTongHopVatTu
	GROUP BY MAVT
GO

SELECT *
FROM dbo.VATTU
WHERE MAVT in
(SELECT MAVT
FROM SLVATTU_HD
WHERE SLHOADON = (SELECT MAX(SLHOADON)
FROM SLVATTU_HD))
-- 29.Lấy ra các thông tin về các mặt hàng mà được bán nhiều nhất.
CREATE VIEW VTBANNHIEUNHAT
AS
	SELECT TOP(1) MAVT, SUM(SL) AS TONGSLBAN FROM BangTongHopVatTu
	GROUP BY MAVT
	ORDER BY TONGSLBAN DESC
GO
SELECT * FROM dbo.VATTU WHERE MAVT = (SELECT MAVT FROM VTBANNHIEUNHAT)
-- 30.Lấy ra danh sách tất cả các khách hàng gồm Mã khách hàng,
-- tên khách hàng, địa chỉ, số lượng hóa đơn đã mua
-- (nếu khách hàng đó chưa mua hàng thì cột số lượng hóa đơn để trống)
SELECT KHACHHANG.MAKH, TENKH, SLHOADON =
	CASE  
		WHEN COUNT(HOADON.MAHD) != 0 THEN COUNT(HOADON.MAHD)
		ELSE NULL
	END
FROM dbo.KHACHHANG LEFT JOIN dbo.HOADON ON
KHACHHANG.MAKH = HOADON.MAKH
GROUP BY KHACHHANG.MAKH, TENKH
