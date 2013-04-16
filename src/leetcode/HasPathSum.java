/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(root == null) return false;
        
        sum = sum- root.val;
        if(sum ==0 && root.right == null && root.left ==null ){ return true;}
        
        return hasPathSum(root.left, sum) || hasPathSum(root.right,sum);
 
    }
    
}
