// Last updated: 7/13/2026, 9:25:34 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        int subArrayLength = 0;
6        Map<Integer, Integer> mp = new HashMap<>();
7        for(int i=0;i<n;i++){
8            sum +=(nums[i]==0) ? -1:1;
9            if(sum == 0){
10                subArrayLength = i+1;
11            }else if(mp.containsKey(sum)){
12                subArrayLength = Math.max(subArrayLength,i-mp.get(sum));
13            }else{
14                mp.put(sum,i);
15            }
16        }
17        return subArrayLength;
18    }
19}