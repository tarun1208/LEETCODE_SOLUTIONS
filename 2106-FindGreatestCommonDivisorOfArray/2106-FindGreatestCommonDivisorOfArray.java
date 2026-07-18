// Last updated: 7/18/2026, 11:31:10 AM
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;;
        int min = nums[0];
        int max = nums[n-1];
        
        while(max !=0){
            int temp = max;
            max = min%max;
            min = temp;
        }
        return min;
    }
}