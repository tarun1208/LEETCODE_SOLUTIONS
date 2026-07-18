// Last updated: 7/18/2026, 2:35:57 PM
1class Solution {
2    public int climbStairs(int n) {
3        if (n == 0 || n == 1) {
4            return 1;
5        }
6        int prev = 1, curr = 1;
7        for (int i = 2; i <= n; i++) {
8            int temp = curr;
9            curr = prev + curr;
10            prev = temp;
11        }
12        return curr;
13    }
14}