// Last updated: 7/13/2026, 9:42:57 PM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        int count = 0;
4        int sum = 0;
5        Map <Integer,Integer> mp = new HashMap<>();
6        for(int num:nums){
7            sum+=num;
8            if(sum == goal){
9                count++;
10            }
11            if(mp.containsKey(sum-goal)){
12                count+= mp.get(sum-goal);
13            }
14            mp.put(sum,mp.getOrDefault(sum,0)+1);
15        }
16        return count;
17    }
18}