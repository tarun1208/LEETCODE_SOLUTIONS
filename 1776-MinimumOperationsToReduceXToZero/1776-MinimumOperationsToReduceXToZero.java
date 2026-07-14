// Last updated: 7/14/2026, 11:41:59 AM
public class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x, n = nums.length;
        for (int num : nums) target += num;
        
        if (target == 0) return n;
        
        int maxLen = 0, sum = 0, left = 0;
        
        for (int right = 0; right < n; ++right) {
            sum += nums[right];
            while (left <= right && sum > target) {
                sum -= nums[left];
                left++;
            }
            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen != 0 ? n - maxLen : -1;
    }
}