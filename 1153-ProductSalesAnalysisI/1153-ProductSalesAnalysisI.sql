-- Last updated: 7/13/2026, 12:10:25 PM
# Write your MySQL query statement below
select product_name, year, price
from Sales s 
join Product p
on s.product_id = p.product_id
