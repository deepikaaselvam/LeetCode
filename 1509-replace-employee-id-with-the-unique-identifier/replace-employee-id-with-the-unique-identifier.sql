# Write your MySQL query statement below
select unique_id,name from employees e1 left join employeeUNI euni2 on e1.id = euni2.id;