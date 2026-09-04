-- Last updated: 9/4/2026, 9:02:27 PM
# Write your MySQL query statement below
select user_id, name, mail
from users
where mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$' 
    and mail like binary '%@leetcode.com'