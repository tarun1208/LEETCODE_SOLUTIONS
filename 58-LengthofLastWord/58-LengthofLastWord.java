// Last updated: 7/14/2026, 5:14:35 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int len = 0;
4        for(int i=s.length()-1;i>=0;i--){
5            if(s.charAt(i) != ' '){
6                len++;
7            }
8            else if(len>0){
9                break;
10            }
11        }
12        return len;
13    }
14}