// Last updated: 7/15/2026, 11:16:45 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int start = 0;
4        int end = s.length()-1;
5
6        while(start<end){
7            if(!Character.isLetterOrDigit(s.charAt(start))){
8                start++;
9                continue;
10            }
11            if(!Character.isLetterOrDigit(s.charAt(end))){
12                end--;
13                continue;
14            }
15            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
16                return false;
17            }
18            start++;
19            end--;
20        }
21        return true;
22    }
23}