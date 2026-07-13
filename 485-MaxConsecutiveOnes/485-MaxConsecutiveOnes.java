// Last updated: 7/13/2026, 12:11:14 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int current = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
                if (current > count) {
                    count = current;
                }
            } else {
                current = 0; 
            }
        }

        return count;
    }
}
