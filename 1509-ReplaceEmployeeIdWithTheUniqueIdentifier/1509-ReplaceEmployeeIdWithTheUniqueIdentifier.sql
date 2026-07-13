-- Last updated: 7/13/2026, 12:09:48 PM
# Write your MySQL query statement below
select u.unique_id, e.name
from EmployeeUNI u
right join Employees e
on u.id = e.id 
