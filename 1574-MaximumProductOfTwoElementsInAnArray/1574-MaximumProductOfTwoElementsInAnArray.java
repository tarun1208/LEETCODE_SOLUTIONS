// Last updated: 7/27/2026, 10:38:33 AM
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = (nums[n-1] - 1) * (nums[n-2] -1);
        return max;
    }
}