--use [sample]

-- This function computes additional total costs that arise
-- if budgets of projects increase
CREATE FUNCTION compute_costs (@percent INT = 10)
RETURNS DECIMAL(16,2)
AS
BEGIN
    DECLARE @additional_costs DEC(14,2), @sum_budget DEC(16,2)
    SELECT @sum_budget = SUM(budget) FROM project
    SET @additional_costs = @sum_budget * @percent /100
    RETURN @additional_costs
END

SELECT project_no, project_name
FROM project
WHERE budget < dbo.compute_costs(25)