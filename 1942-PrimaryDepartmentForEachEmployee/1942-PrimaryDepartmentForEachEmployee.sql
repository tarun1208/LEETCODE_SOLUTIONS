-- Last updated: 7/13/2026, 12:09:14 PM
# Write your MySQL query statement below
select employee_id,department_id
from Employee
where employee_id in (
    select employee_id
    from Employee
    group by employee_id
    having count(*) = 1
) or primary_flag = 'Y'