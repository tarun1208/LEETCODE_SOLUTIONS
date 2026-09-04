-- Last updated: 9/4/2026, 9:03:31 PM
# Write your MySQL query statement below
select product_id, new_price as price
from Products
where (product_id, change_date) in (
    select product_id, max(change_date)
    from Products
    where change_date <= '2019-08-16'
    group by product_id
)

union all

select distinct product_id, 10 as price
from Products
group by product_id
having min(change_date) > '2019-08-16';