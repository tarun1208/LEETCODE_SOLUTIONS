// Last updated: 7/29/2026, 10:21:46 AM
1class Solution {
2    public String smallestPalindrome(String s, int kx) {
3        int[] arr = new int[26];
4        long k = kx;
5
6        // Count frequencies
7        for (char c : s.toCharArray()) {
8            arr[c - 'a']++;
9        }
10
11        // Only care about half for palindrome
12        for (int i = 0; i < 26; i++) {
13            arr[i] /= 2;
14        }
15
16        // If total permutations < k, it's invalid
17        if (perm(arr, kx) < kx) {
18            return "";
19        }
20
21        StringBuilder sb = new StringBuilder();
22        int n = s.length();
23
24        // Build first half of palindrome
25        for (int ix = 0; ix < n / 2; ix++) {
26            for (int i = 0; i < 26; i++) {
27                if (arr[i] == 0) continue;
28
29                arr[i]--;
30                long per = perm(arr, k);
31                if (per >= k) {
32                    sb.append((char) ('a' + i));
33                    break;
34                } else {
35                    k -= per;
36                    arr[i]++;
37                }
38            }
39        }
40
41        // Construct full palindrome
42        return (n % 2 == 0)
43            ? sb.toString() + sb.reverse().toString()
44            : sb.toString() + s.charAt(n / 2) + sb.reverse().toString();
45    }
46
47    // Efficient nCr with limit pruning
48    public long nCr(int n, int r, long lim) {
49        long res = 1;
50        r = Math.min(r, n - r);
51        for (int i = 1; i <= r; i++) {
52            res *= (n - i + 1);
53            res /= i;
54            if (res > lim) return lim + 1;
55        }
56        return res;
57    }
58
59    // Calculates total permutations with current letter frequencies
60    public long perm(int[] arr, long lim) {
61        int total = 0;
62        for (int i : arr) total += i;
63
64        long res = 1;
65        for (int i = 0; i < 26; i++) {
66            long choices = nCr(total, arr[i], lim);
67            if (choices == lim + 1) return lim + 1;
68
69            res *= choices;
70            if (res > lim) return lim;
71
72            total -= arr[i];
73        }
74        return res;
75    }
76}