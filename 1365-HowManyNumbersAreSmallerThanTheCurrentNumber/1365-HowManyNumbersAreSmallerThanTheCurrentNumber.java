// Last updated: 9/4/2026, 9:02:47 PM
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