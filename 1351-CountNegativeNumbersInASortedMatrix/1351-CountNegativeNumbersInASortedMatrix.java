// Last updated: 9/4/2026, 9:02:53 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] <0){
                    count += grid[i].length - j;
                    break;
                }
            }
        }
        return count;
    }
}