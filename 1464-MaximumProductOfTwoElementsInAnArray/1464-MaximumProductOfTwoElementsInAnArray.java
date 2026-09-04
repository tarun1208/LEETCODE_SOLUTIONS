// Last updated: 9/4/2026, 9:02:35 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = (nums[n-1] - 1) * (nums[n-2] -1);
        return max;
    }
}