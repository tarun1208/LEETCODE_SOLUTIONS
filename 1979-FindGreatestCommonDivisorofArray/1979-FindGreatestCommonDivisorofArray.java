// Last updated: 7/18/2026, 7:32:05 AM
1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;;
5        int min = nums[0];
6        int max = nums[n-1];
7        
8        while(max !=0){
9            int temp = max;
10            max = min%max;
11            min = temp;
12        }
13        return min;
14    }
15}