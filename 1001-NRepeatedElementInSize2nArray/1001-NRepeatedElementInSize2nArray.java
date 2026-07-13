// Last updated: 7/13/2026, 12:10:39 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}