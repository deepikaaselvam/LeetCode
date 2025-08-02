# Write your MySQL query statement below




select "High Salary" as category ,count(income) as accounts_count from Accounts where income>50000
union 
select "Average Salary" as category,count(income) as accounts_count from Accounts  where income>=20000 and income<=50000
union
select "Low Salary" as category ,count(income) as accounts_count from Accounts where income<20000;
-- select 
-- case 
-- when income<20000 then  "Low Salary" as category 
-- when income>20000 and income<=50000 then "Average Salary"as category
-- when income>50000 then "High Salary"as category
-- else return 0
-- end
-- group by income as account_count from Accounts;
