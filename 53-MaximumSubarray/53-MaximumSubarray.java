// Last updated: 7/15/2026, 2:19:19 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum = 0;
4        int ans = Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7            ans = Math.max(ans,sum);
8            if(sum<0){
9                sum = 0;
10            }
11        }
12        return ans;
13    }
14}