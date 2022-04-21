DECLARE @count INT = 1;

WHILE @count < 5
BEGIN
    PRINT @count;
    SET @count = @count + 1;
END