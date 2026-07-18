// Last updated: 7/18/2026, 10:52:20 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3    
4        return n>0 && (n&(n-1))==0;
5    }
6}