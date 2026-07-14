// Last updated: 7/14/2026, 4:03:56 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if (s.length() != t.length()) {
5            return false;
6        }
7
8        HashMap<Character,Integer> map1 = new HashMap<>();
9        for(int i=0;i<s.length();i++){
10            char c = s.charAt(i);
11            map1.put(c, map1.getOrDefault(c, 0) + 1);
12        }
13        for(int i=0;i<t.length();i++){
14            char d = t.charAt(i);
15            map1.put(d, map1.getOrDefault(d, 0) - 1);
16        }
17        for (int count : map1.values()) {
18            if (count != 0) {
19                return false;
20            }
21        }
22        return true;
23    }
24}