// Last updated: 7/15/2026, 9:32:09 PM
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num:nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7
8        int count = 0;
9        for(int val : map.values()){
10            count = Math.max(count,val);
11        }
12
13        int ans = 0;
14        for(int val : map.values()){
15            if(val == count){
16                ans+=val;
17            }
18        }
19        return ans;
20    }
21}