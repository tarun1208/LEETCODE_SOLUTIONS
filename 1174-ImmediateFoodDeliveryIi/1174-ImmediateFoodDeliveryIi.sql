-- Last updated: 9/4/2026, 9:03:23 PM
# Write your MySQL query statement below
select round(avg(order_date = customer_pref_delivery_date)*100,2) as immediate_percentage
from delivery
where (customer_id, order_date) in (select customer_id,MIN(order_date) from delivery group by customer_id);