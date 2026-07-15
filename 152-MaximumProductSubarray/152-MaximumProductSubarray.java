// Last updated: 7/15/2026, 3:13:36 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length;
4        int left = 1;
5        int right = 1;
6        int max = Integer.MIN_VALUE;
7        for(int i = 0; i<n;i++){
8            if(left == 0) left = 1;
9            if(right == 0) right = 1;
10
11            left = left*nums[i];
12            right = right*nums[n-i-1];
13            max = Math.max(max,Math.max(left, right));
14        }
15        return max;
16    }
17}