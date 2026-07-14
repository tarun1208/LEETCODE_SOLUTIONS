// Last updated: 7/14/2026, 3:58:43 PM
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
13        HashMap<Character,Integer> map2 = new HashMap<>();
14        for(int i=0;i<t.length();i++){
15            char c = t.charAt(i);
16            map2.put(c, map2.getOrDefault(c, 0) + 1);
17        }
18        if(map1.equals(map2)){
19            return true;
20        }
21        return false;
22    }
23}