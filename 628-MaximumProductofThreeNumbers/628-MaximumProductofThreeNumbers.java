// Last updated: 7/26/2026, 7:32:14 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        int mul1 = nums[n-1] * nums[n-2] * nums[n-3];
6        int mul2 = nums[0] * nums[1] * nums[n-1];
7        return Math.max(mul1,mul2);
8    }
9}