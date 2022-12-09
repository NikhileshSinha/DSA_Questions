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
    static int max=0;
    static void findMax(TreeNode n, int an){
        if(n==null) return;
        findMax(n.left, an);
        {
            int sub=an-n.val;
            if(sub<0){sub*=(-1);}
            if(sub>max){max=sub;}
        }
        findMax(n.right, an);
        {
            int sub=an-n.val;
            if(sub<0){sub*=(-1);}
            if(sub>max){max=sub;}
        }
    }
    static void traverse(TreeNode n){
        if(n==null)return;
        findMax(n, n.val);
        traverse(n.left);
        traverse(n.right);
    }
    public int maxAncestorDiff(TreeNode root) {
        traverse(root);
        int ret = max;
        max=0;
        return ret;
    }
}
