// Last updated: 7/13/2026, 9:57:18 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count = 0;
4        for (int i = 0; i < nums.length; i++) {
5            int sum = 0;
6            for (int j = i; j < nums.length; j++) {
7                sum += nums[j];
8                if (sum == k) {
9                    count++;
10                }
11            }
12        }
13        return count;
14    }
15}