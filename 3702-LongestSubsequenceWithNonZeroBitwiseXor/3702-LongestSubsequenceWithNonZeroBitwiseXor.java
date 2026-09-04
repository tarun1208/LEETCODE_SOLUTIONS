// Last updated: 9/4/2026, 8:59:43 PM
class Solution {
    public int longestSubsequence(int[] A) {
        int total = 0;
        int n = A.length;
        boolean nonZero = false;

        for (int x : A) {
            nonZero |= x > 0;
            total ^= x;
        }

        if (!nonZero) return 0;
        return total == 0 ? n - 1 : n;
    }
}