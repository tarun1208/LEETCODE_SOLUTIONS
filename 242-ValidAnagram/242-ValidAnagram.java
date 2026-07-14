// Last updated: 7/14/2026, 3:46:40 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()){
4            return false;
5        }
6
7        int count[] = new int[26];
8        
9        for(int i=0;i<s.length();i++){
10            count[s.charAt(i)-'a']++;
11            count[t.charAt(i)-'a']--;
12        }
13        for(int val : count){
14            if(val != 0){
15                return false;
16            }
17        }
18        return true;
19    }
20}