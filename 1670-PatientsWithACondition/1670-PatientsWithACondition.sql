-- Last updated: 7/23/2026, 4:24:53 PM
# Write your MySQL query statement below
select patient_id,patient_name,conditions
from Patients
where conditions like "% DIAB1%" or conditions like "DIAB1%"