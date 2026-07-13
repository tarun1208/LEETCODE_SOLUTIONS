// Last updated: 7/13/2026, 12:09:45 PM
class Solution {
    public int numOfWays(int n) {
        int modulo = 1000000007;
        long alternative = 6;
        long different = 6;
        for(int i=2; i<=n;i++){
            long new_alt = (3*alternative + 2*different)%modulo;
            long new_diff = (2*alternative + 2*different)%modulo;
            alternative = new_alt;
            different = new_diff;
        }
        return(int)((alternative + different)%modulo);
    }
}