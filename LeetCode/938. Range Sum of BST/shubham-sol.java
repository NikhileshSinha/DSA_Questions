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
    int sum = 0;

    public void traversal(TreeNode node, int low, int high){
        if (node != null) {
            traversal(node.left, low, high);
            if (node.val <= high && node.val >= low)
                sum += node.val;
            traversal(node.right, low, high);
        }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        traversal(root, low, high);
        return sum;

    }
}