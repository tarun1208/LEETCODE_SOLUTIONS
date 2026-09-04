-- Last updated: 9/4/2026, 9:02:25 PM
# Write your MySQL query statement below
select patient_id,patient_name,conditions
from Patients
where conditions like "% DIAB1%" or conditions like "DIAB1%"