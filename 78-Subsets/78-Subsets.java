// Last updated: 7/20/2026, 10:06:23 AM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtracking(nums,new ArrayList<>(),0,result);
5        return result;
6    }
7
8    public List<List<Integer>> backtracking(int []nums, List<Integer> temp, int start, List<List<Integer>> result){
9        result.add(new ArrayList<>(temp));
10        for(int i=start;i<nums.length;i++){
11            temp.add(nums[i]);
12            backtracking(nums,temp,i+1,result);
13            temp.remove(temp.size()-1);
14        }
15        return result;
16    }
17}