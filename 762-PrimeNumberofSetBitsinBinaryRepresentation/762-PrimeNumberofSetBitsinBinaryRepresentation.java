// Last updated: 9/21/2026, 2:38:40 PM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int count = 0;
4        
5        for (int i = left; i <= right; i++) {
6            int setBits = Integer.bitCount(i);
7            if (isPrime(setBits)) {
8                count++;
9            }
10        }
11        return count;
12    }
13    
14    private boolean isPrime(int n) {
15        return n == 2 || n == 3 || n == 5 || n == 7 || 
16               n == 11 || n == 13 || n == 17 || n == 19;
17    }
18}