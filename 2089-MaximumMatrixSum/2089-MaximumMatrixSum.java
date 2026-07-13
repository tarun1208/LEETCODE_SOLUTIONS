// Last updated: 7/13/2026, 12:09:08 PM
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n =matrix.length;
        int m = matrix[0].length;
        int min = Integer.MAX_VALUE;
        int count=0;
        long sum =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum +=Math.abs(matrix[i][j]);
                if(matrix[i][j]<0){
                    count++;
                }
                min = Math.min(min,Math.abs(matrix[i][j]));
            }
        }
        if(count%2==1){
            sum -=2*min;
        }
        return sum;
    }
}