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
        long maximum = 0;
    public int maxProduct(TreeNode root) {
        if(root == null)
            return 0;
        TreeNode current = root;
        long tot = 0;
        tot = trav(current,tot);
        trav(root,tot);
        return (int) (maximum%1000000007);
    }
    public long trav(TreeNode root,long tot){
        if(root==null) return 0;
        long sel = root.val;
        sel += trav(root.left,tot)+trav(root.right,tot);
        if(tot > 0) 
            maximum = Math.max(maximum,((tot-sel)*sel));
        return sel;
    }
}
