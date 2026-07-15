// Last updated: 7/15/2026, 12:14:22 PM
1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4
5        while (x != 0) {
6            int digit = x % 10;
7            x = x / 10;
8            
9            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
10                return 0;
11            }
12
13            rev = rev * 10 + digit;
14        }
15
16        return rev;
17    }
18}
19