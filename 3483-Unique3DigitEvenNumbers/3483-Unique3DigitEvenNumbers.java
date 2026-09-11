// Last updated: 9/11/2026, 10:25:35 AM
class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        for (int num = 100; num <= 998; num += 2) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            int[] currentFreq = new int[10];
            currentFreq[d1]++;
            currentFreq[d2]++;
            currentFreq[d3]++;

            boolean canForm = true;
            for (int i = 0; i < 10; i++) {
                if (currentFreq[i] > freq[i]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                count++;
            }
        }

        return count;
    }
}