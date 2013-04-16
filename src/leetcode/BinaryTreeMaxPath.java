/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class BinaryTreeMaxPath {
    
    public int sum =0;
    public int maxPathSum(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        sum = root != null ? root.val: 0;
        max(root);
        return sum;                
    }
    
    public int max(TreeNode root){
        if(root==null) return 0;
        
        int left = Math.max(max(root.left), 0);
        int right = Math.max(max(root.right), 0);

        sum = Math.max(sum, left + right + root.val);
        return  root.val + Math.max(left, right);
    }

}
