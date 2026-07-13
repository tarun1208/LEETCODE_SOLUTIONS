-- Last updated: 7/13/2026, 12:11:06 PM
# Write your MySQL query statement below
select e.name 
from Employee e
join Employee e1
on e.id = e1.managerId
group by e.id,e.name
having count(e1.id)>=5