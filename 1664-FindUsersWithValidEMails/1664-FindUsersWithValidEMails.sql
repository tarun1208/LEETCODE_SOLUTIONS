-- Last updated: 7/20/2026, 10:30:45 AM
# Write your MySQL query statement below
select user_id, name, mail
from users
where mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$' 
    and mail like binary '%@leetcode.com'