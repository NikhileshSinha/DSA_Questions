import java.util.*;
class Solution {
    static List<Integer> lst1 ;
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        lst1.add(root.val);
        inorder(root.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        lst1 = new LinkedList<Integer>();
        inorder(root);
        return lst1;
    }
}
