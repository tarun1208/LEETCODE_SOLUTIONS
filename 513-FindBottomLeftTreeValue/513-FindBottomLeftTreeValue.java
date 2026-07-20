// Last updated: 7/20/2026, 9:58:24 PM
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
17    public int findBottomLeftValue(TreeNode root) {
18        if(root == null){
19            return -1;
20        }
21        
22        Queue<TreeNode> queue = new LinkedList<>();
23        queue.add(root);
24
25        TreeNode currentNode = null;
26
27        while(!queue.isEmpty()){
28            currentNode = queue.poll();
29
30            if(currentNode.right != null){
31                queue.add(currentNode.right);
32            }
33
34            if(currentNode.left!=null){
35                queue.add(currentNode.left);
36            }
37
38        }
39        return currentNode.val;
40    }
41}