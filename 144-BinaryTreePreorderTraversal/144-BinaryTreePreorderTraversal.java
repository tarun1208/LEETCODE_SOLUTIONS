// Last updated: 7/23/2026, 11:28:57 AM
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> list = new ArrayList<>();
19        traverse(root,list);
20        return list;
21    }
22
23    private void traverse(TreeNode node, List<Integer> list){
24        if(node == null){
25            return;
26        }
27
28        list.add(node.val);
29        traverse(node.left,list);
30        traverse(node.right,list);
31    }
32}