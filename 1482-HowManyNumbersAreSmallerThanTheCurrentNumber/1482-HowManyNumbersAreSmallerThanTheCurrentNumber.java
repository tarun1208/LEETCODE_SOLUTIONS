// Last updated: 7/13/2026, 12:09:51 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n =nums.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}