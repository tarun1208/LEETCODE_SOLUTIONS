// Last updated: 7/15/2026, 7:59:00 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        for(int i=0;i<arr.length;i++){
4            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
5                return i+1;
6            }
7        }
8        return -1;
9    }
10}