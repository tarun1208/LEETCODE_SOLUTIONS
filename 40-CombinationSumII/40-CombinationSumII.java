// Last updated: 7/22/2026, 7:29:59 PM
1class Solution {
2
3    List<List<Integer>> ans = new ArrayList<>();
4
5    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
6        Arrays.sort(candidates);
7        backtrack(candidates,target,new ArrayList<>(),0);
8        return ans;
9    }
10
11    
12    void backtrack(int[] candidates, int target, List<Integer> curr, int idx){
13        if(target == 0){
14            ans.add(new ArrayList<>(curr));
15            return;
16        }
17
18        if(target < 0 || idx==candidates.length) return;
19        curr.add(candidates[idx]);
20        backtrack(candidates,target-candidates[idx],curr,idx+1);
21        curr.remove(curr.size() - 1);
22
23        while (idx + 1 < candidates.length && candidates[idx] == candidates[idx + 1]) {
24            idx++;
25        }
26        backtrack(candidates,target,curr,idx+1);
27    }
28}