// Last updated: 7/17/2026, 11:16:14 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    ArrayList<Integer> list = new ArrayList<>();
18    public int minDiffInBST(TreeNode root) {
19        if(root == null){
20            return 0;
21        }
22        minDiffInBST(root.left);
23        list.add(root.val);
24        minDiffInBST(root.right);
25        int min = Integer.MAX_VALUE;
26        for(int i=0; i<list.size()-1;i++){
27            int x = list.get(i + 1) - list.get(i); 
28            if (x < min) {
29                min = x;
30            }
31        }
32        return min;
33    }
34}