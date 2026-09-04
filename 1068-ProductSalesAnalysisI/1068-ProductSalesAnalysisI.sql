-- Last updated: 9/4/2026, 9:04:04 PM
# Write your MySQL query statement below
select product_name, year, price
from Sales s 
join Product p
on s.product_id = p.product_id
