-- Last updated: 7/13/2026, 12:10:24 PM
# Write your MySQL query statement below
select product_id, year as first_year,quantity,price
from Sales
where (product_id,year) in (select product_id,min(year)
    from Sales
    group by product_id)