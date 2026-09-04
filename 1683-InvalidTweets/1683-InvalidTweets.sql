-- Last updated: 9/4/2026, 9:01:56 PM
# Write your MySQL query statement below
select tweet_id
from Tweets
where length(content) >15