-- Last updated: 7/13/2026, 12:10:23 PM
# Write your MySQL query statement below
select p.project_id,round(avg(e.experience_years),2) as average_years
from Project p
left join Employee e
on p.employee_id = e.employee_id
group by p.project_id