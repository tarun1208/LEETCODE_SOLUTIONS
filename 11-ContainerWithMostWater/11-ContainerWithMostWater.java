// Last updated: 7/13/2026, 12:12:20 PM
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1;
        int water = 0;

        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int w = j - i;
            int area = h * w;
            water = Math.max(water, area);

            while (i < j && height[i] <= h) {
                i++;
            }
            while (i < j && height[j] <= h) {
                j--;
            }
        }

        return water;
    }
}