// Last updated: 7/15/2026, 4:08:31 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3
4        int totalSum = 0;
5        for (int num : nums) {
6            totalSum += num;
7        }
8        int currMax = nums[0];
9        int maxSum = nums[0];
10        for (int i = 1; i < nums.length; i++) {
11            currMax = Math.max(nums[i], currMax + nums[i]);
12            maxSum = Math.max(maxSum, currMax);
13        }
14        int currMin = nums[0];
15        int minSum = nums[0];  
16        for (int i = 1; i < nums.length; i++) {
17            currMin = Math.min(nums[i], currMin + nums[i]);
18            minSum = Math.min(minSum, currMin);
19        }
20        if (maxSum < 0) {
21            return maxSum;
22        }
23
24        return Math.max(maxSum, totalSum - minSum);
25    }
26}