// Last updated: 7/20/2026, 10:27:07 AM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int row=grid.length;
4        int col=grid[0].length;
5        int len=row*col;
6        int[] res=new int[len];
7        int index=0;
8
9        for(int i=0;i<row;i++){
10            for(int j=0;j<col;j++){
11               res[index++]=grid[i][j]; 
12            }
13        }
14        
15        index=len-(k%len);
16
17        List<List<Integer>> list=new ArrayList<>();
18        for(int i=0;i<row;i++){
19            List<Integer> innerList=new ArrayList<>();
20            for(int j=0;j<col;j++){
21                innerList.add(res[index%len]);
22                index++;
23            }
24            list.add(innerList);
25        }
26        return list;
27    }
28}