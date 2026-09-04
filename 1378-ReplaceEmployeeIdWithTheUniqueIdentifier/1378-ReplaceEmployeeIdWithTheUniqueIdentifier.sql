-- Last updated: 9/4/2026, 9:02:46 PM
# Write your MySQL query statement below
select u.unique_id, e.name
from EmployeeUNI u
right join Employees e
on u.id = e.id 
