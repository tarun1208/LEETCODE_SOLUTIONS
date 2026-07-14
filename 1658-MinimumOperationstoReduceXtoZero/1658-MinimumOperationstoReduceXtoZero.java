// Last updated: 7/14/2026, 10:01:26 AM
1public class Solution {
2    public int minOperations(int[] nums, int x) {
3        int target = -x, n = nums.length;
4        for (int num : nums) target += num;
5        
6        if (target == 0) return n;
7        
8        int maxLen = 0, sum = 0, left = 0;
9        
10        for (int right = 0; right < n; ++right) {
11            sum += nums[right];
12            while (left <= right && sum > target) {
13                sum -= nums[left];
14                left++;
15            }
16            if (sum == target) {
17                maxLen = Math.max(maxLen, right - left + 1);
18            }
19        }
20        return maxLen != 0 ? n - maxLen : -1;
21    }
22}