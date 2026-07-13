-- Last updated: 7/13/2026, 12:11:05 PM
# Write your MySQL query statement below
select name,bonus
from Employee e
left join Bonus b
on e.empId = b.empId
where b.bonus < 1000 or b.bonus is null