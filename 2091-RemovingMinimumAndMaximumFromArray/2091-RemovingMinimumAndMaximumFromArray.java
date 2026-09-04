// Last updated: 9/4/2026, 9:01:15 PM
class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;

        int min = 0;
        int max = 0;

        for(int i=1; i<n; i++){
            if(nums[i] < nums[min]){
                min = i;
            }
            if(nums[i] > nums[max]){
                max = i;
            }
        }

        int low = Math.min(min,max);
        int high = Math.max(max, min);

        int front = high + 1;
        int back = n-low;
        int both = (low+1) + (n-high);
        return Math.min(front, Math.min(back, both));
    }
}