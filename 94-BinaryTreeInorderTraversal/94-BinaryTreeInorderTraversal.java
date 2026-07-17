// Last updated: 7/17/2026, 9:49:50 AM
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
18    public List<Integer> inorderTraversal(TreeNode root) {
19        if(root == null){
20            return list;
21        }
22        inorderTraversal(root.left);
23        list.add(root.val);
24        inorderTraversal(root.right);
25        return list;
26    }
27    
28}