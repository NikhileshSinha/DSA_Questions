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
    static int sum=0;
    static void inorder(TreeNode r,int a, int b){
        if(r==null){
            return;
        }
        inorder(r.left,a,b);
        System.out.println(r.val);
        if(r.val>a && r.val<b){
            sum+=r.val;
            System.out.println("r.val >>"+r.val+" sum: "+sum);
        }
        inorder(r.right,a,b);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return sum;
        }
        sum=0;
        System.out.println(">>SUM0: "+sum);
        inorder(root,low,high);
        System.out.println(">>SUM1: "+sum);
        sum += low+high;
        System.out.println(">>SUM2: "+sum);
        return sum;
    }
}
