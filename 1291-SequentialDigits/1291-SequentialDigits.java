// Last updated: 7/13/2026, 2:30:23 PM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer> result = new ArrayList<>();
4
5        String digits = "123456789";
6
7        for (int len = 2; len <= 9; len++) {
8            for (int i = 0; i <= 9 - len; i++) {
9                int num = Integer.parseInt(digits.substring(i, i + len));
10
11                if (num >= low && num <= high) {
12                    result.add(num);
13                }
14            }
15        }
16
17        return result;
18    }
19}