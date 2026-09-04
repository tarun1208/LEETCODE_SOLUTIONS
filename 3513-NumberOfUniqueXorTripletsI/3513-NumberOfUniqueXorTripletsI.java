// Last updated: 9/4/2026, 9:00:00 PM
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if(n<=2){
            return n;
        }

        int powerOfTwo = 1;
        
        while (powerOfTwo <= n) {
            powerOfTwo *= 2;
        }

        return powerOfTwo;
    }
}