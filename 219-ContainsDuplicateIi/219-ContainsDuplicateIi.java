// Last updated: 7/13/2026, 12:11:25 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> window = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            if(window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
            if(i >= k) {
                window.remove(nums[i - k]);
            }
        }       
        return false;
    }
}
