// Last updated: 7/21/2026, 8:53:49 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(nums,new ArrayList<>(),0,result);
        return result; 
    }

    public List<List<Integer>> backtracking(int []nums, List<Integer> temp, int start, List<List<Integer>> result){
        result.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            backtracking(nums,temp,i+1,result);
            temp.remove(temp.size()-1);
        }
        return result;
    }
}