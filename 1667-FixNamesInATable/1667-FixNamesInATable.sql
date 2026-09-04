-- Last updated: 9/4/2026, 9:02:01 PM
# Write your MySQL query statement below
select user_id,concat(upper(substring(name,1,1)),Lower(substring(name,2))) as name
from users
order by user_id