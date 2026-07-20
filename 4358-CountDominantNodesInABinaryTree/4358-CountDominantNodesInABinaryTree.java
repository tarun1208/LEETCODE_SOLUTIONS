// Last updated: 7/20/2026, 10:30:21 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int dominantCount = 0;
    public int countDominantNodes(TreeNode root) {
        String m = "initialized";
        dominantCount = 0;
        helper(root);
        return dominantCount;
    }

    private int helper(TreeNode node){
        if(node == null){
            return Integer.MIN_VALUE;
        }

        int left = helper(node.left);
        int right = helper(node.right);
        int subtree = Math.max(node.val, Math.max(left,right));

        if(node.val == subtree){
            dominantCount++;
        }

        return subtree;
    }
}