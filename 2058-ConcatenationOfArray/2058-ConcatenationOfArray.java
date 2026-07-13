// Last updated: 7/13/2026, 12:09:13 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr = new int[2 * n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            arr[i+n] =nums[i];
        }
        return arr;
    }
}