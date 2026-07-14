// Last updated: 7/14/2026, 9:34:03 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        int[] pCounts = new int[26];

        for (char c : p.toCharArray()) {
            pCounts[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        int[] sCounts = new int[26];
        
        for (int i = 0; i < p.length() - 1; i++) {
            char c = s.charAt(i);
            sb.append(c);
            sCounts[c - 'a']++;
        }

        for (int i = p.length() - 1; i < s.length(); i++) {
            char newChar = s.charAt(i);
            sb.append(newChar);
            sCounts[newChar - 'a']++;

            if (matches(pCounts, sCounts)) {
                result.add(i - p.length() + 1);
            }

            char oldChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sCounts[oldChar - 'a']--;
        }

        return result;
    }
    private boolean matches(int[] pCounts, int[] sCounts) {
        for (int i = 0; i < 26; i++) {
            if (pCounts[i] != sCounts[i]) {
                return false;
            }
        }
        return true;
    }
}