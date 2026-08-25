// Last updated: 8/25/2026, 10:25:29 AM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int multiple = k;
        while(set.contains(multiple)){
            multiple +=k;
        }
        return multiple;

    }
}