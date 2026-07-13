-- Last updated: 7/13/2026, 12:10:06 PM
# Write your MySQL query statement below
select distinct author_id as id
from Views
where author_id =viewer_id
order by id