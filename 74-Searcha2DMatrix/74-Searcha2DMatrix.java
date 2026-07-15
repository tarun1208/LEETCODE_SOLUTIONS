// Last updated: 7/15/2026, 7:49:31 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        for(int i=0;i<m;i++){
6            for(int j=0;j<n;j++){
7                if(matrix[i][j] == target){
8                    return true;
9                }
10            }
11        }
12        return false;
13    }
14}
15