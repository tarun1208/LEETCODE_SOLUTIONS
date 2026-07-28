// Last updated: 7/28/2026, 10:03:15 AM
1class Solution {
2    public String smallestPalindrome(String s) {
3        if(s.length() <= 1) return s;
4        int n = s.length();
5
6        char[] half = s.substring(0,n/2).toCharArray();
7        Arrays.sort(half);
8
9        StringBuilder sb = new StringBuilder();
10        sb.append(half);
11
12        if(n%2 != 0){
13            sb.append(s.charAt(n/2));
14        }
15
16        for(int i=half.length-1;i>=0;i--){
17            sb.append(half[i]);
18        }
19
20        return sb.toString();
21    }
22}