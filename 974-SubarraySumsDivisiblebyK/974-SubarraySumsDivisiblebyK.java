// Last updated: 7/13/2026, 9:48:58 PM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        int sum =0;
4        int count = 0;
5        HashMap<Integer, Integer> map = new HashMap<>();
6        map.put(0,1);
7        for(int num:nums){
8            sum += num;
9            int rem = sum%k;
10            if(rem<0) rem+=k;
11            count+=map.getOrDefault(rem,0);
12            map.put(rem,map.getOrDefault(rem,0)+1);
13        }
14        return count;
15    }
16}