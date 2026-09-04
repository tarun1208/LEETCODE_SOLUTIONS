// Last updated: 9/4/2026, 8:59:39 PM
class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        dp[0] = 0;

        for(int i=1;i<=n; i++){
            int min = Integer.MAX_VALUE;

            for(int j=1;j<=3;j++){
                if(i-j >= 0){
                    int cost = costs[i-1] + (j*j);
                    min = Math.min(min,dp[i-j]+cost);
                }
            }
            dp[i] = min;
        }
        return dp[n];
    }
}