// Last updated: 7/14/2026, 11:42:37 AM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        if (s.length() < 10) {
            return new ArrayList<>();
        }

        for (int i = 0; i <= s.length() - 10; i++) {
            String subseq = s.substring(i, i + 10);
            if (!seen.add(subseq)) {
                repeated.add(subseq);
            }
        }

        return new ArrayList<>(repeated);
    }
}
