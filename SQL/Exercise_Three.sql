SELECT s.AccountNumber, s.OrderDate
FROM (
    SELECT so.*,
        TotalPerAccount = SUM(ss.LineTotal) OVER (PARTITION BY so.AccountNumber),
        rn = ROW_NUMBER() OVER (PARTITION BY so.AccountNumber ORDER BY so.OrderDate DESC)
    FROM Sales.SalesOrderHeader so
    JOIN Sales.SalesOrderDetail ss ON so.SalesOrderID = ss.SalesOrderID
) s
WHERE s.TotalPerAccount > 70000
  AND s.rn <= 5;
