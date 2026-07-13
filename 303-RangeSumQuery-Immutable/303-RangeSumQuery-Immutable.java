// Last updated: 7/13/2026, 9:15:25 PM
1class NumArray {
2    private int[] pre;
3    public NumArray(int[] nums) {
4        int n = nums.length;
5        pre = new int[n+1];
6        pre[0] = 0;
7        for(int i=1;i<=n;i++){
8            pre[i] = pre[i-1] + nums[i-1];;
9        }
10    }
11    
12    public int sumRange(int left, int right) {
13        return pre[right+1]-pre[left];
14    }
15}
16
17/**
18 * Your NumArray object will be instantiated and called as such:
19 * NumArray obj = new NumArray(nums);
20 * int param_1 = obj.sumRange(left,right);
21 */