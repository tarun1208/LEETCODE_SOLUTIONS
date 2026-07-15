// Last updated: 7/15/2026, 9:40:45 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int count = 0;
        for(int val : map.values()){
            count = Math.max(count,val);
        }

        int ans = 0;
        for(int val : map.values()){
            if(val == count){
                ans+=val;
            }
        }
        return ans;
    }
}