// Last updated: 7/28/2026, 12:18:42 PM
class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mul1 = nums[n-1] * nums[n-2] * nums[n-3];
        int mul2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(mul1,mul2);
    }
}