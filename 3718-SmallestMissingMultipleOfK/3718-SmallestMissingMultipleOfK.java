// Last updated: 9/4/2026, 8:59:35 PM
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