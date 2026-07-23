// Last updated: 7/23/2026, 9:18:30 AM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4
5        if(n<=2){
6            return n;
7        }
8
9        int powerOfTwo = 1;
10        
11        while (powerOfTwo <= n) {
12            powerOfTwo *= 2;
13        }
14
15        return powerOfTwo;
16    }
17}