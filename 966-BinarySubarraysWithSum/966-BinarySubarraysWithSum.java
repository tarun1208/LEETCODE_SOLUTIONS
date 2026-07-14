// Last updated: 7/14/2026, 11:42:17 AM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        Map <Integer,Integer> mp = new HashMap<>();
        for(int num:nums){
            sum+=num;
            if(sum == goal){
                count++;
            }
            if(mp.containsKey(sum-goal)){
                count+= mp.get(sum-goal);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}