// Last updated: 7/20/2026, 10:27:45 PM
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;
        int len=row*col;
        int[] res=new int[len];
        int index=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               res[index++]=grid[i][j]; 
            }
        }
        
        index=len-(k%len);

        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<row;i++){
            List<Integer> innerList=new ArrayList<>();
            for(int j=0;j<col;j++){
                innerList.add(res[index%len]);
                index++;
            }
            list.add(innerList);
        }
        return list;
    }
}