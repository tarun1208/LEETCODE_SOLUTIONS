// Last updated: 7/19/2026, 7:35:16 AM
1class Solution {
2    public String smallestSubsequence(String s) {
3        int[] last = new int[26];
4        boolean[] seen = new boolean[26];
5        StringBuilder res = new StringBuilder();
6
7        for (int i = 0; i < s.length(); i++)
8            last[s.charAt(i) - 'a'] = i;
9
10        for (int i = 0; i < s.length(); i++) {
11            int c = s.charAt(i) - 'a';
12            if (seen[c]) continue;
13
14            while (res.length() > 0 && res.charAt(res.length() - 1) > s.charAt(i)
15                   && last[res.charAt(res.length() - 1) - 'a'] > i) {
16                seen[res.charAt(res.length() - 1) - 'a'] = false;
17                res.deleteCharAt(res.length() - 1);
18            }
19
20            res.append(s.charAt(i));
21            seen[c] = true;
22        }
23
24        return res.toString();
25    }
26}