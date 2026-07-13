-- Last updated: 7/13/2026, 12:09:30 PM
# Write your MySQL query statement below
select tweet_id
from Tweets
where length(content) >15