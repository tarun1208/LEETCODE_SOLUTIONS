// Last updated: 7/15/2026, 2:37:05 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int start = 0;
        int end = n-1;
        int sum = 0;
        int arr[] = new int[2];
        while(start<end){
            sum = numbers[start]+numbers[end];
            if(sum == target){
                arr[0] = start+1;
                arr[1] = end+1;
                return arr;
            }
            else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return arr;
    }
}