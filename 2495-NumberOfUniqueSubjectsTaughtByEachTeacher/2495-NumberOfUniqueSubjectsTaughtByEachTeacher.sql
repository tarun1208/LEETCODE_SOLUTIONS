-- Last updated: 7/13/2026, 12:09:02 PM
# Write your MySQL query statement below
select teacher_id,count(distinct(subject_id))as cnt
from Teacher
group by teacher_id