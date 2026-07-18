// Last updated: 7/18/2026, 9:20:01 AM
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
17
18    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
19
20        if (root == null) {
21            return false;
22        }
23        if (isSameTree(root, subRoot)) {
24            return true;
25        }
26        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
27    }
28
29    public boolean isSameTree(TreeNode p, TreeNode q) {
30
31        if (p == null && q == null) {
32            return true;
33        }
34
35        if (p == null || q == null) {
36            return false;
37        }
38
39        if (p.val != q.val) {
40            return false;
41        }
42
43        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
44    }
45}