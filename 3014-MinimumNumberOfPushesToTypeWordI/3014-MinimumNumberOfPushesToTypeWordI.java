// Last updated: 9/4/2026, 9:00:47 PM
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int block = n/8;
        return (block * (block+1)* 4) + (n%8)*(block+1);
    }
}