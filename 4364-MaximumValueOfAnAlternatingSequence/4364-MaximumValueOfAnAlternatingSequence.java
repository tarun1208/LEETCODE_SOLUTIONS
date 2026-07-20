// Last updated: 7/20/2026, 10:30:16 AM
class Solution {
    public long maximumValue(int n, int s, int m) {
        long ma = s;
        if(n==1){
            return ma;
        }

        long maxOddIndex = ((n-1)%2 == 1 ? (n-1) : (n-2));

        long ups = (maxOddIndex+1)/2;
        long down = (maxOddIndex-1)/2;

        long maxVal = ma+(ups*m)-down;

        return maxVal;
    }
}