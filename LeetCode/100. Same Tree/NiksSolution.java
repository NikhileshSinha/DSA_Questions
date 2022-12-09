import java.util.*;

class Solution {
    public static boolean isSame(TreeNode a, TreeNode b){
        boolean ans=true;
        if(a==null && b==null){
            ans= true;
            return ans;
        }
        else if(a==null || b==null){
            ans = false;
            return ans;
        }
        Queue <TreeNode> qu1 = new LinkedList<>();
        Queue <TreeNode> qu2 = new LinkedList<>();
        qu1.add(a);
        qu2.add(b);
        while(!qu1.isEmpty()&&!qu2.isEmpty()){
            TreeNode cn1 = qu1.remove();
            TreeNode cn2 = qu2.remove();
            //System.out.println("cn1.val: "+cn1.val+" cn2.val: "+cn2.val);
            
            //Checking in right
            if((cn1.right!=null && cn2.right==null)||(cn1.right==null && cn2.right!=null)){
                ans= false;
                return ans;
                //System.out.println("Invoking answer2: "+ans);
            }
            //Checking in left
            if((cn1.left!=null && cn2.left==null)||(cn1.left==null && cn2.left!=null)){
                ans= false;
                return ans;
                //System.out.println("Invoking answer3: "+ans);
            }
            
            
            //Checking the values
            if(cn1.val!=cn2.val){
                ans= false;
                return ans;
                //System.out.println("Invoking answer1: "+ans);
            }
            
            
            //Traversing to left
            if(cn1.left!=null && cn2.left!=null){
                qu1.add(cn1.left);
                qu2.add(cn2.left);
            }
            //Traversing to right
            if(cn1.right!=null && cn2.right!=null){
                qu1.add(cn1.right);
                qu2.add(cn2.right);
            }
                        
        }
        return ans;
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        else{
         boolean haha = isSame(p,q);
        return haha;
        }
    }
}
