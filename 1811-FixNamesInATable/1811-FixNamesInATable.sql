-- Last updated: 7/24/2026, 8:51:10 PM
# Write your MySQL query statement below
select user_id,concat(upper(substring(name,1,1)),Lower(substring(name,2))) as name
from users
order by user_id