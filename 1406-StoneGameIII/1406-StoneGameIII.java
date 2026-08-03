// Last updated: 8/3/2026, 11:05:50 AM
1class Solution {
2    public String stoneGameIII(int[] stoneValue) {
3        int n = stoneValue.length;
4        int[] dp = new int[n + 1];
5
6        for(int i=n-1; i>=0; i--){
7            int take = 0;
8            dp[i] = Integer.MIN_VALUE;
9
10            for (int k = 0; k < 3 && i + k < n; k++) {
11                take += stoneValue[i + k];
12                dp[i] = Math.max(dp[i], take - dp[i + k + 1]);
13            }
14        }
15
16        if (dp[0] > 0) return "Alice";
17        if (dp[0] < 0) return "Bob";
18        return "Tie";
19    }
20}