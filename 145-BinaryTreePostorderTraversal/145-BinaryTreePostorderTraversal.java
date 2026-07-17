// Last updated: 7/17/2026, 9:53:13 AM
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
18    public List<Integer> postorderTraversal(TreeNode root) {
19        if(root == null){
20            return list;
21        }
22        postorderTraversal(root.left);
23        postorderTraversal(root.right);
24        list.add(root.val);
25        return list;
26    }
27}