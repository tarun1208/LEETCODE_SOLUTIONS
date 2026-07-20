// Last updated: 7/20/2026, 10:28:28 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
    
        return n>0 && (n&(n-1))==0;
    }
}