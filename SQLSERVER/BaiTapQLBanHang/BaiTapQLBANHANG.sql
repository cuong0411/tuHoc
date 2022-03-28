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
-- 12.Lấy ra danh sách những khách hàng (tên khách hàng, địa chỉ, số điện thoại)
-- đã mua hàng trong tháng 6/2010.
-- 13.Lấy ra danh sách những khách hàng không mua hàng trong tháng 6/2010 gồm
-- các thông tin tên khách hàng, địa chỉ, số điện thoại.
-- 14.Lấy ra các chi tiết hóa đơn gồm
-- các thông tin mã hóa đơn, mã vật tư, tên vật tư, đơn vị tính, giá bán, giá mua,
-- số lượng, trị giá mua (giá mua * số lượng), trị giá bán (giá bán * số lượng).
-- 15.Lấy ra các chi tiết hóa đơn gồm các thông tin mã hóa đơn,
-- mã vật tư, tên vật tư, đơn vị tính, giá bán, giá mua,
-- số lượng, trị giá mua (giá mua * số lượng),
-- trị giá bán (giá bán * số lượng) mà có giá bán lớn hơn hoặc bằng giá mua.
-- 16.Lấy ra các thông tin gồm mã hóa đơn, mã vật tư, tên vật tư, đơn vị tính, giá bán,
-- giá mua, số lượng, trị giá mua (giá mua * số lượng),
-- trị giá bán (giá bán * số lượng) và
-- cột khuyến mãi với khuyến mãi 10% cho những mặt hàng bán trong một hóa đơn lớn hơn 100.
-- 17.Tìm ra những mặt hàng chưa bán được.
-- 18.Tạo bảng tổng hợp gồm các thông tin: mã hóa đơn, ngày hóa đơn, tên khách hàng,
-- địa chỉ, số điện thoại, tên vật tư, đơn vị tính, giá mua, giá bán,
-- số lượng, trị giá mua, trị giá bán. 
-- 19.Tạo bảng tổng hợp tháng 5/2010 gồm các thông tin: mã hóa đơn, ngày hóa đơn,
-- tên khách hàng, địa chỉ, số điện thoại, tên vật tư, đơn vị tính, giá mua,
-- giá bán, số lượng, trị giá mua, trị giá bán. 
-- 20.Tạo bảng tổng hợp quý 1 – 2010 gồm các thông tin:
-- mã hóa đơn, ngày hóa đơn, tên khách hàng, địa chỉ, số điện thoại,
-- tên vật tư, đơn vị tính, giá mua, giá bán, số lượng, trị giá mua, trị giá bán. 
-- 21.Lấy ra danh sách các hóa đơn gồm các thông tin: Số hóa đơn, ngày,
-- tên khách hàng, địa chỉ khách hàng, tổng trị giá của hóa đơn.
-- 22.Lấy ra hóa đơn có tổng trị giá lớn nhất gồm các thông tin:
-- Số hóa đơn, ngày, tên khách hàng, địa chỉ khách hàng, tổng trị giá của hóa đơn.
-- 23.Lấy ra hóa đơn có tổng trị giá lớn nhất trong tháng 5/2010 gồm
-- các thông tin: Số hóa đơn, ngày, tên khách hàng, địa chỉ khách hàng, tổng trị giá của hóa đơn.
-- 24.Đếm xem mỗi khách hàng có bao nhiêu hóa đơn.
-- 25.Đếm xem mỗi khách hàng, mỗi tháng có bao nhiêu hóa đơn.
-- 26.Lấy ra các thông tin của khách hàng có số lượng hóa đơn mua hàng nhiều nhất.
-- 27.Lấy ra các thông tin của khách hàng có số lượng hàng mua nhiều nhất.
-- 28.Lấy ra các thông tin về các mặt hàng mà được bán trong nhiều hóa đơn nhất.
-- 29.Lấy ra các thông tin về các mặt hàng mà được bán nhiều nhất.
-- 30.Lấy ra danh sách tất cả các khách hàng gồm Mã khách hàng,
-- tên khách hàng, địa chỉ, số lượng hóa đơn đã mua
-- (nếu khách hàng đó chưa mua hàng thì cột số lượng hóa đơn để trống)
