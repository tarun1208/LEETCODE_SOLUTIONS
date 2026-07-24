// Last updated: 7/24/2026, 8:50:56 PM
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        boolean[] xorPair = new boolean[2048];
        boolean[] xorTriple = new boolean[2048];

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                xorPair[nums[i]^nums[j]] = true;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<2048;j++){
                if(xorPair[j]){
                    xorTriple[j^nums[i]] = true;
                }
            }
        }

        int count = 0;
        for(boolean val : xorTriple){
            if(val){
                count++;
            }
        }

        return count;
    }
}