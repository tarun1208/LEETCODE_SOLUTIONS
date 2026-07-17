// Last updated: 7/17/2026, 1:09:12 PM
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
17    public boolean isBalanced(TreeNode root) {
18        if(root == null){
19            return true;
20        }
21
22        int lHeight = getHeight(root.left);
23        int rHeight = getHeight(root.right);
24
25        boolean balanced = Math.abs(lHeight - rHeight) <= 1;
26        return balanced && isBalanced(root.left) && isBalanced(root.right);
27    }
28
29    private int getHeight(TreeNode node){
30        if(node == null){
31            return 0;
32        }
33        return 1+Math.max(getHeight(node.left), getHeight(node.right));
34    }
35}