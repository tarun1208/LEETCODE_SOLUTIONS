// Last updated: 7/21/2026, 8:51:25 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> list = new ArrayList<>();
4        Arrays.sort(candidates);
5        backtrack(list, new ArrayList<>(), candidates, target, 0);
6        return list;
7    }
8
9    private void backtrack(List<List<Integer>> list, List<Integer> result, int[] candidates, int remain, int start) {
10        if (remain < 0) {
11            return;
12        } else if (remain == 0) {
13            list.add(new ArrayList<>(result));
14        } else {
15            for (int i = start; i < candidates.length; i++) {
16                result.add(candidates[i]);
17                backtrack(list, result, candidates, remain - candidates[i], i);
18                result.remove(result.size() - 1);
19            }
20        }
21    }
22}