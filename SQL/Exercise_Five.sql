USE [AdventureWorks2017]
GO
/****** Object:  StoredProcedure [dbo].[changeName]    Script Date: 10-10-2022 13:59:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER procedure [dbo].[changeName]
  @name varchar(50) 
as
if @name is null begin;
  set @name='Piyush'
end;
SELECT FirstName,MiddleName,LastName
FROM Person.Person
WHERE FirstName=@Name; 