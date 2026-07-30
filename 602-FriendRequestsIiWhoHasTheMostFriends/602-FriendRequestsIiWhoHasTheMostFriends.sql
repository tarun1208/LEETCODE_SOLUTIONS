-- Last updated: 7/30/2026, 8:15:28 AM
# Write your MySQL query statement below
select id, count(*) as num
from(
    select requester_id as id from RequestAccepted
    union all
    select accepter_id as id from RequestAccepted
) as id_s
group by id
order by num desc 
limit 1