// Last updated: 7/14/2026, 9:08:46 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum = 0;
4        for(int i=0;i<k;i++){
5            sum += nums[i];
6        }
7        int maxSum = sum;
8        for(int i=k;i<nums.length;i++){
9            sum = sum - nums[i-k] + nums[i];
10            if(sum > maxSum){
11                maxSum = sum;
12            }
13        }
14        return (double) maxSum/k;
15    }
16}