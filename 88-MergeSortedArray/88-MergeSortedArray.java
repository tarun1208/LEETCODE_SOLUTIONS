// Last updated: 7/22/2026, 2:43:25 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3
4        for (int j = 0, i = m; j < n; j++) {
5            nums1[i] = nums2[j];
6            i++;
7        }
8        
9        Arrays.sort(nums1);
10    }
11}