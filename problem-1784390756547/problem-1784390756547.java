// Last updated: 7/18/2026, 9:35:56 PM
1class Solution {
2    public long maximumValue(int n, int s, int m) {
3        long ma = s;
4        if(n==1){
5            return ma;
6        }
7
8        long maxOddIndex = ((n-1)%2 == 1 ? (n-1) : (n-2));
9
10        long ups = (maxOddIndex+1)/2;
11        long down = (maxOddIndex-1)/2;
12
13        long maxVal = ma+(ups*m)-down;
14
15        return maxVal;
16    }
17}