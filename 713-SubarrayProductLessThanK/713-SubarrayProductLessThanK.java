// Last updated: 7/14/2026, 9:48:27 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k<=1){
4            return 0;
5        }
6        int count = 0;
7        int product =1;
8        int left = 0;
9        for(int right = 0;right<nums.length;right++){
10            product *=nums[right];
11            while(product>=k){
12                product /=nums[left];
13                left++;
14            }
15            count +=(right-left+1);
16        }
17        return count;
18    }
19}