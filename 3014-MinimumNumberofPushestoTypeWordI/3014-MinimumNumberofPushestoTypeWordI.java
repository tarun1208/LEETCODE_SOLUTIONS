// Last updated: 7/30/2026, 8:02:58 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int n = word.length();
4        int block = n/8;
5        return (block * (block+1)* 4) + (n%8)*(block+1);
6    }
7}