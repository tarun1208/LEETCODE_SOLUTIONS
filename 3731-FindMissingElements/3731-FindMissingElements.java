// Last updated: 8/4/2026, 9:19:05 AM
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbers {
    public static List<Integer> findMissingNumbers(int[] nums) {
        // Step 1: Find the minimum and maximum values in nums
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < minNum) {
                minNum = num;
            }
            if (num > maxNum) {
                maxNum = num;
            }
        }

        // Step 2: Create a complete set of numbers in the range [minNum, maxNum]
        Set<Integer> completeSet = new HashSet<>();
        for (int i = minNum; i <= maxNum; i++) {
            completeSet.add(i);
        }

        // Step 3: Add nums to a set for quick lookup
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        // Step 4: Find the missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = minNum; i <= maxNum; i++) {
            if (!numsSet.contains(i)) {
                missingNumbers.add(i);
            }
        }

        // Step 5: Return the sorted list of missing integers (already sorted by adding in order)
        return missingNumbers;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(findMissingNumbers(new int[]{1, 4, 2, 5})); // Output: [3]
        System.out.println(findMissingNumbers(new int[]{7, 8, 6, 9})); // Output: []
        System.out.println(findMissingNumbers(new int[]{5, 1})); // Output: [2, 3, 4]
    }
}
