// Last updated: 7/31/2026, 2:55:00 PM
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,new ArrayList<>(),0);
        return ans;
    }

    
    void backtrack(int[] candidates, int target, List<Integer> curr, int idx){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0 || idx==candidates.length) return;
        curr.add(candidates[idx]);
        backtrack(candidates,target-candidates[idx],curr,idx+1);
        curr.remove(curr.size() - 1);

        while (idx + 1 < candidates.length && candidates[idx] == candidates[idx + 1]) {
            idx++;
        }
        backtrack(candidates,target,curr,idx+1);
    }
}