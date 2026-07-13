// Last updated: 7/13/2026, 12:11:15 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int count[] = new int[n+1];
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }

        for(int i=1;i<=n;i++){
            if(count[i]==0){
                result.add(i);
            }
        }
        return result;
    }
}