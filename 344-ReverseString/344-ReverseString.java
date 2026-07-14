// Last updated: 7/14/2026, 12:02:01 PM
1class Solution {
2    public void reverseString(char[] s) {
3       StringBuilder sb = new StringBuilder(new String(s));
4       sb.reverse();
5       for (int i = 0; i < s.length; i++) {
6            s[i] = sb.charAt(i);
7        }
8    }
9}