// Last updated: 7/14/2026, 12:11:21 PM
1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder sb = new StringBuilder();
4        String[] words = s.trim().split("\\s+");
5
6        for (int i = words.length - 1; i >= 0; i--) {
7            sb.append(words[i]);
8            if (i != 0) {
9                sb.append(" ");
10            }
11        }
12
13        return sb.toString();
14    }
15}