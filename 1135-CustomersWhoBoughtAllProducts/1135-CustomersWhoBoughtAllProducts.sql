-- Last updated: 7/13/2026, 12:10:32 PM
# Write your MySQL query statement below
select customer_id
from Customer
group by customer_id
having count(distinct product_key) = (select count(product_key)
                                        from Product)