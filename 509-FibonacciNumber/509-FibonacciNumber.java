// Last updated: 7/22/2026, 10:10:47 AM
1class Solution {
2    public int fib(int n) {
3        if(n<=1) return n;
4        
5        int[] dp = new int[n+1];
6        dp[0] = 0;
7        dp[1] = 1;
8        for(int i=2;i<=n;i++){
9            dp[i] = dp[i-1]+dp[i-2];
10        }
11        return dp[n];
12    }
13}