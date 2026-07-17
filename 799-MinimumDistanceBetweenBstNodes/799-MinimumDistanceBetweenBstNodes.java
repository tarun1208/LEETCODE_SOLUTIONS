// Last updated: 7/17/2026, 11:56:41 AM
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
    ArrayList<Integer> list = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        if(root == null){
            return 0;
        }
        minDiffInBST(root.left);
        list.add(root.val);
        minDiffInBST(root.right);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size()-1;i++){
            int x = list.get(i + 1) - list.get(i); 
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}