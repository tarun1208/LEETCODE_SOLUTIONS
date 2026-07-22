// Last updated: 7/22/2026, 2:33:39 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int n = coins.length;
4        int [] dp = new int[amount+1];
5
6        if(amount<1) return 0;
7
8        return solve(coins,amount,dp);
9    }
10    
11    private int solve(int[] coins, int rem, int[] dp){
12
13        if(rem < 0) return -1;
14        if(rem == 0) return 0;
15        if(dp[rem] !=0) return dp[rem];
16
17        int minCoins = Integer.MAX_VALUE;
18
19        for (int coin : coins) {
20            int res = solve(coins, rem - coin, dp);
21
22            if (res >= 0 && res < minCoins) {
23                minCoins = 1 + res;
24            }
25        }
26
27        dp[rem] = (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
28        return dp[rem];
29    }
30}