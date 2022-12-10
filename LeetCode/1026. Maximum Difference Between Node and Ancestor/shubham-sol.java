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

    static int max = 0;

    public void inOrder(TreeNode p) {
        if (p == null) return;
        FindMax(p, p.val);
        inOrder(p.left);
        inOrder(p.right);
    }

    public void FindMax(TreeNode q, int n) {
        if (q == null) return;
        FindMax(q.left, n);
        if (Math.abs(n - q.val) > max)
            max = Math.abs(n - q.val);
        FindMax(q.right, n);
    }

    public int maxAncestorDiff(TreeNode root) {
        inOrder(root);
        int res = max;
        max = 0;
        return res;
    }
}
