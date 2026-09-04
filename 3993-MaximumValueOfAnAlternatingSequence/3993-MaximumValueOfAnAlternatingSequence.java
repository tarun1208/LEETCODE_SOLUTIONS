// Last updated: 9/4/2026, 8:59:13 PM
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