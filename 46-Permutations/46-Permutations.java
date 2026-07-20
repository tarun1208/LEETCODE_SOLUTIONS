// Last updated: 7/20/2026, 12:08:30 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4
5        boolean[] used = new boolean[nums.length];
6        backtrack(result, new ArrayList<>(), nums, used);
7        return result;
8    }
9
10    private void backtrack(List<List<Integer>> result, List<Integer> currList, int[] nums ,boolean[] used) {
11
12        if (currList.size() == nums.length) {
13            result.add(new ArrayList<>(currList));
14            return;
15        }
16
17        for (int i = 0; i < nums.length; i++) {
18            if (used[i]) continue;
19
20            used[i] = true;
21            currList.add(nums[i]);
22
23            backtrack(result, currList, nums, used);
24
25            currList.remove(currList.size() - 1);
26            used[i] = false;
27        }
28    }
29}