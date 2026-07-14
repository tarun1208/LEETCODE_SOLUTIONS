// Last updated: 7/14/2026, 5:32:06 PM
1class Solution {
2    public String addBinary(String a, String b) {
3
4        StringBuilder result = new StringBuilder();
5        int i = a.length() - 1;
6        int j = b.length() - 1;
7        int carry = 0;
8
9        while (i >= 0 || j >= 0 || carry != 0) {
10            int sum = carry;
11            if (i >= 0) {
12                sum += a.charAt(i) - '0';
13                i--;
14            }
15            if (j >= 0) {
16                sum += b.charAt(j) - '0';
17                j--;
18            }
19            result.append(sum % 2);
20            carry = sum / 2;
21        }
22        return result.reverse().toString();
23    }
24}