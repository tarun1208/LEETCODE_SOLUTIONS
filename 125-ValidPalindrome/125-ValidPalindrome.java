// Last updated: 7/15/2026, 11:23:35 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
4        int l=0;
5        int n=s.length();
6        int r=n-1;
7        while (l < r) {
8            if (s.charAt(l) != s.charAt(r)) {
9                return false;
10            }
11            l++;
12            r--;
13        }        
14        return true;
15    }
16}