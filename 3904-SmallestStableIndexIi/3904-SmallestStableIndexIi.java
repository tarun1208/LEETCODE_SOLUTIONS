// Last updated: 9/5/2026, 9:07:02 AM
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int dp[] = new int[n+1];
        dp[n-1] = nums[n-1];
        int max = dp[0];

        for(int i=n-2; i>=0; i--){
            dp[i] = Math.min(nums[i],dp[i+1]);
        }

        for(int i =0; i<n;i++){
            max = Math.max(max,nums[i]);
            if(max-dp[i] <=k){
                return i;
            }
        }
        return -1;
    }
}