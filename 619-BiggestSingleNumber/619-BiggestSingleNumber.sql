-- Last updated: 7/13/2026, 12:10:54 PM
# Write your MySQL query statement below
select max(num) as num
from (
    select num
    from MyNumbers
    group by num
    Having count(num) = 1
) as singleNumber
