// Last updated: 7/15/2026, 8:09:46 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8            if (mid % 2 == 1) {
9                mid--;
10            }
11            if (nums[mid] == nums[mid + 1]) {
12                left = mid + 2; 
13            } else {
14                right = mid; 
15            }
16        }
17        return nums[left];
18    }
19}