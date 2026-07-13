-- Last updated: 7/13/2026, 12:10:01 PM
# Write your MySQL query statement below
select query_name,round(avg(rating/position),2) as quality,
        round(avg(if(rating<3,1,0))*100,2) as poor_query_percentage
from Queries
group by query_name