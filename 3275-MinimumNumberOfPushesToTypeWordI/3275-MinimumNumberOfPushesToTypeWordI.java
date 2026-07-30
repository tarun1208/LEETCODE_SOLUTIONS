// Last updated: 7/30/2026, 8:03:31 AM
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int block = n/8;
        return (block * (block+1)* 4) + (n%8)*(block+1);
    }
}