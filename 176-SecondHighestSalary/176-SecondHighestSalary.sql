-- Last updated: 7/22/2026, 2:38:41 PM
# Write your MySQL query statement below
select max(salary) as SecondHighestSalary
from Employee
where salary < (select max(salary)
                    from Employee)