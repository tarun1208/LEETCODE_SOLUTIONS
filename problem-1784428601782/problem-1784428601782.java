// Last updated: 7/19/2026, 8:06:41 AM
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
17    private int dominantCount = 0;
18    public int countDominantNodes(TreeNode root) {
19        String m = "initialized";
20        dominantCount = 0;
21        helper(root);
22        return dominantCount;
23    }
24
25    private int helper(TreeNode node){
26        if(node == null){
27            return Integer.MIN_VALUE;
28        }
29
30        int left = helper(node.left);
31        int right = helper(node.right);
32        int subtree = Math.max(node.val, Math.max(left,right));
33
34        if(node.val == subtree){
35            dominantCount++;
36        }
37
38        return subtree;
39    }
40}