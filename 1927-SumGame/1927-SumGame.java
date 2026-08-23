// Last updated: 8/23/2026, 9:52:36 AM
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] mat1 = {{3, 1, 2}, {4, 8, 5}, {6, 9, 7}};
        System.out.println(solution.zigzagSequence(mat1)); // Output: 18

        int[][] mat2 = {{1, 2, 4}, {3, 9, 6}, {11, 3, 15}};
        System.out.println(solution.zigzagSequence(mat2)); // Output: 28
    }
}
