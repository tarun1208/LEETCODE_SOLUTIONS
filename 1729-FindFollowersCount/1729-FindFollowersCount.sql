-- Last updated: 9/4/2026, 9:01:53 PM
# Write your MySQL query statement below
select user_id,count(follower_id) as followers_count
from Followers
group by user_id
order by user_id asc