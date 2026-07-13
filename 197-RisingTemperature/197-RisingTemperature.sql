-- Last updated: 7/13/2026, 12:11:29 PM
# Write your MySQL query statement below
select w.id
from Weather w
where w.temperature > (
    select w1.temperature
    from Weather w1
    where DATEDIFF(w.recordDate,w1.recordDate) =1
)