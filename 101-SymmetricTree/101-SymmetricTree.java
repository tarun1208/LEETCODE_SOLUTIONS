// Last updated: 7/17/2026, 10:23:59 AM
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
17    public boolean isSymmetric(TreeNode root) {
18        if(root == null){
19            return true;
20        }
21        return isPattern(root.left,root.right);
22    }
23    private boolean isPattern(TreeNode l, TreeNode r){
24        if(l == null && r == null){
25            return true;
26        }
27        if(l == null || r == null){
28            return false;
29        }
30        if(l.val != r.val){
31            return false;
32        }
33        return isPattern(l.left, r.right) && isPattern(l.right, r.left);
34    }
35}