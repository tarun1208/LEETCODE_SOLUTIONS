// Last updated: 7/22/2026, 2:12:31 PM
1class Solution {
2    int dp[][];
3    public int uniquePaths(int m, int n) {
4
5        dp = new int[m][n];
6        for(int row[]:dp)
7            Arrays.fill(row,-1);
8
9        return solve(0,0,m,n);
10    }
11
12    private int solve(int i,int j,int m, int n){
13        if(i>=m || j>=n) return 0;
14        if(i == m-1 && j == n-1) return 1;
15        if (dp[i][j] != -1) return dp[i][j];
16        int down = solve(i+1,j,m,n);
17        int right = solve(i,j+1,m,n);
18
19        dp[i][j] = down + right;
20        return dp[i][j];
21    }
22}