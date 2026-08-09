// Last updated: 8/9/2026, 12:17:14 PM
class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n / 2 + 2];
        int suffixSum = 0;

        for (int i = n - 1; i >= 0; i--) {
            suffixSum += piles[i];
            
            for (int M = 1; M <= n / 2 + 1; M++) {
                if (i + 2 * M >= n) {
                    dp[i][M] = suffixSum;
                    continue;
                }

                int best = 0;
                for (int X = 1; X <= 2 * M; X++) {
                    int nextM = Math.max(M, X);
                    if (nextM > n / 2 + 1) nextM = n / 2 + 1;
                    
                    best = Math.max(best, suffixSum - dp[i + X][nextM]);
                }
                dp[i][M] = best;
            }
        }

        return dp[0][1];
    }
}