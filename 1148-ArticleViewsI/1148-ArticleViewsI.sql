-- Last updated: 9/4/2026, 9:03:35 PM
# Write your MySQL query statement below
select distinct author_id as id
from Views
where author_id =viewer_id
order by id