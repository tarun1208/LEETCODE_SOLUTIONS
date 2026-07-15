// Last updated: 7/15/2026, 9:41:20 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                return i+1;
            }
        }
        return -1;
    }
}