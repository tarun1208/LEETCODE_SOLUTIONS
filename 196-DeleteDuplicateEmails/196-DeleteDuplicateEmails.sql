-- Last updated: 7/31/2026, 2:54:12 PM
delete p1
from Person p1
join Person p2
on p1.email = p2.email and p1.id > p2.id