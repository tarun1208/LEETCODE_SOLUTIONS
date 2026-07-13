// Last updated: 7/13/2026, 12:10:05 PM
class Solution {
    public int sumFourDivisors(int[] nums) {
        long total = 0;
        for (int n : nums) {
            int count = 0;
            int sum = 0;
            int root = (int) Math.sqrt(n);
            for (int i = 1; i <= root; i++) {
                if (n % i == 0) {
                    int j = n / i;

                    if (i == j) {
                        count += 1;
                        sum += i;
                    } else {
                        count += 2;
                        sum += i + j;
                    }
                    if (count > 4) break;
                }
            }
            if (count == 4) {
                total += sum;
            }
        }
        return (int) total;
    }
}