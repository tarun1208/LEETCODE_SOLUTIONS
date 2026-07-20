// Last updated: 7/20/2026, 10:27:58 PM
class Solution {
    public String smallestSubsequence(String s) {
        int[] last = new int[26];
        boolean[] seen = new boolean[26];
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
            last[s.charAt(i) - 'a'] = i;

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (seen[c]) continue;

            while (res.length() > 0 && res.charAt(res.length() - 1) > s.charAt(i)
                   && last[res.charAt(res.length() - 1) - 'a'] > i) {
                seen[res.charAt(res.length() - 1) - 'a'] = false;
                res.deleteCharAt(res.length() - 1);
            }

            res.append(s.charAt(i));
            seen[c] = true;
        }

        return res.toString();
    }
}