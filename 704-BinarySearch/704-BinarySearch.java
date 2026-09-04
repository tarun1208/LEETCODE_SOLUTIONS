// Last updated: 9/4/2026, 9:04:35 PM
class Solution {
    public int search(int[] nums, int target) {
        int n =nums.length;
        int low=0,high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target ) return mid;
            else if(target > nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}