-- Last updated: 7/28/2026, 10:14:34 AM
# Write your MySQL query statement below
select person_name
from (
    select person_name, sum(weight) over(order by turn) as total_weight
    from Queue
) t
where total_weight <= 1000
order by total_weight desc
limit 1