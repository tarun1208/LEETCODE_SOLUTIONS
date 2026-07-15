// Last updated: 7/15/2026, 9:41:18 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int currMax = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);
        }
        int currMin = nums[0];
        int minSum = nums[0];  
        for (int i = 1; i < nums.length; i++) {
            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}