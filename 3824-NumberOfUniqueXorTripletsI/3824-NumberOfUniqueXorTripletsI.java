// Last updated: 7/23/2026, 4:24:35 PM
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