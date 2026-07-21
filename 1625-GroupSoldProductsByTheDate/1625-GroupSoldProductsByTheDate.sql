-- Last updated: 7/21/2026, 8:52:26 PM
# Write your MySQL query statement below
select sell_date,count(distinct product) as num_sold,group_concat(distinct product order by product separator ',') as products
from Activities
group by sell_date
order by sell_date