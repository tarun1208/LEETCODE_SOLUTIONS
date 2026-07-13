// Last updated: 7/13/2026, 12:11:32 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}