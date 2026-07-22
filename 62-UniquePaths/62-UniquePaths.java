// Last updated: 7/22/2026, 2:20:56 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int dp[] = new int[n];
4        Arrays.fill(dp,1);
5
6        for(int i=1;i<m;i++){
7            for(int j=1; j<n; j++){
8                dp[j] = dp[j] + dp[j-1];
9            }
10        }
11
12        return dp[n-1];
13    }
14}