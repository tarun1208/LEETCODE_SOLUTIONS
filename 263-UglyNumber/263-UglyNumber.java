// Last updated: 9/21/2026, 2:42:49 PM
1class Solution {
2    public boolean isUgly(int n) {
3        if (n <= 0) return false;
4        
5        int[] factors = {2, 3, 5};
6        for (int factor : factors) {
7            while (n % factor == 0) {
8                n /= factor;
9            }
10        }
11        return n == 1;
12    }
13}