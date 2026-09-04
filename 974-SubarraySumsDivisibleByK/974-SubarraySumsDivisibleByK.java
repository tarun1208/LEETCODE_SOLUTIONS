// Last updated: 9/4/2026, 9:04:10 PM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum =0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum += num;
            int rem = sum%k;
            if(rem<0) rem+=k;
            count+=map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}