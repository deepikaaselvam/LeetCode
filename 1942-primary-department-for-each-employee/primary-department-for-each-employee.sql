# Write your MySQL query statement below
select employee_id ,
case 
    when (count(employee_id))>1 then
    (select department_id  from employee where employee_id =e.employee_id and primary_flag='Y')
        else department_id
end as department_id
from Employee e group by employee_id;