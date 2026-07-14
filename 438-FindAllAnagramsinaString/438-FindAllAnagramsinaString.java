// Last updated: 7/14/2026, 9:17:51 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> result = new ArrayList<>();
4        if (s == null || p == null || s.length() < p.length()) {
5            return result;
6        }
7
8        int[] pCounts = new int[26];
9
10        for (char c : p.toCharArray()) {
11            pCounts[c - 'a']++;
12        }
13
14        StringBuilder sb = new StringBuilder();
15        int[] sCounts = new int[26];
16        
17        for (int i = 0; i < p.length() - 1; i++) {
18            char c = s.charAt(i);
19            sb.append(c);
20            sCounts[c - 'a']++;
21        }
22
23        for (int i = p.length() - 1; i < s.length(); i++) {
24            char newChar = s.charAt(i);
25            sb.append(newChar);
26            sCounts[newChar - 'a']++;
27
28            if (matches(pCounts, sCounts)) {
29                result.add(i - p.length() + 1);
30            }
31
32            char oldChar = sb.charAt(0);
33            sb.deleteCharAt(0);
34            sCounts[oldChar - 'a']--;
35        }
36
37        return result;
38    }
39    private boolean matches(int[] pCounts, int[] sCounts) {
40        for (int i = 0; i < 26; i++) {
41            if (pCounts[i] != sCounts[i]) {
42                return false;
43            }
44        }
45        return true;
46    }
47}