// Last updated: 7/20/2026, 12:14:20 PM
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5        backtracking(nums,new ArrayList<>(),0,result);
6        return result; 
7    }
8
9    public List<List<Integer>> backtracking(int []nums, List<Integer> temp, int start, List<List<Integer>> result){
10        result.add(new ArrayList<>(temp));
11        for(int i=start;i<nums.length;i++){
12            if (i > start && nums[i] == nums[i - 1]) {
13                continue;
14            }
15            temp.add(nums[i]);
16            backtracking(nums,temp,i+1,result);
17            temp.remove(temp.size()-1);
18        }
19        return result;
20    }
21}