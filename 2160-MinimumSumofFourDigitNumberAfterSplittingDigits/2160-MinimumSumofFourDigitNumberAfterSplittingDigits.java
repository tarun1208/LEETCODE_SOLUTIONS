// Last updated: 9/21/2026, 2:44:09 PM
1class Solution {
2    public int minimumSum(int num) {
3        int[] digits = new int[4];
4        for (int i = 0; i < 4; i++) {
5            digits[i] = num % 10;
6            num /= 10;
7        }
8        Arrays.sort(digits);
9        int new1 = digits[0] * 10 + digits[2];
10        int new2 = digits[1] * 10 + digits[3];
11        
12        return new1 + new2;
13    }
14}