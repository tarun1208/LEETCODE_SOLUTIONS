// Last updated: 7/14/2026, 9:39:15 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int max = 0;
4        String current = "";
5
6        for (int i = 0; i < s.length(); i++) {
7            String ch = String.valueOf(s.charAt(i));
8            if (current.contains(ch)) {
9                int index = current.indexOf(ch);
10                current = current.substring(index + 1);
11            }
12            current += ch;
13            max = Math.max(max, current.length());
14        }
15        return max;
16    }
17}