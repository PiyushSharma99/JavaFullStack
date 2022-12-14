USE [AdventureWorks2017]
GO
/****** Object:  UserDefinedFunction [dbo].[DetailsOrder]    Script Date: 10-10-2022 13:56:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER FUNCTION [dbo].[DetailsOrder]( @SalesOrderId int, @CurrencyCode nvarchar(10), @Date date ) 
RETURNS TABLE 
AS 
RETURN 
(SELECT OrderQty, ProductID, UnitPrice *
(SELECT EndOfDayRate
FROM    Sales.CurrencyRate
WHERE (ToCurrencyCode = @CurrencyCode) AND (ModifiedDate = @Date)) AS UnitPrice
FROM   Sales.SalesOrderDetail
WHERE (SalesOrderID = @SalesOrderId));

--  query to test above function
-- SELECT* FROM DetailsOrder(43667,'MXN','2007-05-12')