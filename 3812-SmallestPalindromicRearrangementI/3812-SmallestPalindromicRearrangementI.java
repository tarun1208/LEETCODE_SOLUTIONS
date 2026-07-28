// Last updated: 7/28/2026, 10:04:19 AM
class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int n = s.length();

        char[] half = s.substring(0,n/2).toCharArray();
        Arrays.sort(half);

        StringBuilder sb = new StringBuilder();
        sb.append(half);

        if(n%2 != 0){
            sb.append(s.charAt(n/2));
        }

        for(int i=half.length-1;i>=0;i--){
            sb.append(half[i]);
        }

        return sb.toString();
    }
}