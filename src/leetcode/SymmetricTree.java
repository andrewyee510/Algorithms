/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class SymmetricTree {
        public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(root==null){ return true;}
        mirror(root.right);
        return check(root.left, root.right);
        
    }
    
    public boolean check(TreeNode node1, TreeNode node2){
        
        if(node1 == null && node2 ==null){
            return true;
        }
        if(node1 == null && node2 !=null || node1 != null && node2 ==null){
            return false;
        }
        
        if(node1.val == node2.val){
            return check(node1.left, node2.left) && check(node1.right, node2.right);
        }
        return false;
        
    }
    
    
    public void mirror(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;
        mirror(root.left);
        mirror(root.right);
    }
    
}
