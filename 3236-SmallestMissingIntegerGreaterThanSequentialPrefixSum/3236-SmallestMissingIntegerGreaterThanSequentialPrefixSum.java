// Last updated: 8/11/2026, 9:37:46 AM
class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]+1){
                sum += nums[i];
            }
            else{
                break;
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}