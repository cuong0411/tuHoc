USE Demo
go

--function
-- CREATE FUNCTION tinh_tong(@a INT, @b INT)
-- RETURNS INT
-- AS
-- BEGIN
--     RETURN @a + @b
-- END

DECLARE @tong INT
SET @tong = (SELECT tinh_tong(1, 2))
SELECT tinh_tong(1, 2) AS tong