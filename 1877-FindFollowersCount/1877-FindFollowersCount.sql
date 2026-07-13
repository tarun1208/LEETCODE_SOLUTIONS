-- Last updated: 7/13/2026, 12:09:22 PM
# Write your MySQL query statement below
select user_id,count(follower_id) as followers_count
from Followers
group by user_id
order by user_id asc