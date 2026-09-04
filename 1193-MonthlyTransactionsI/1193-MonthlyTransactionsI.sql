-- Last updated: 9/4/2026, 9:03:20 PM
# Write your MySQL query statement below
select DATE_FORMAT(trans_date, '%Y-%m') as month,country
    ,count(id) as trans_count
    ,sum(case when state='approved' then 1 else 0 end) as approved_count
    ,sum(amount) as trans_total_amount
    ,sum(case when state='approved' then amount else 0 end) as approved_total_amount
from transactions
group by month,country