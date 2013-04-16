/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
Given a binary tree, determine if it is height-balanced.
An example of a height-balanced tree. A height-balanced tree is a tree whose subtrees differ in height by no more than one and the subtrees are height-balanced, too.
*/



public class BalancedBinaryTree {
    
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
   public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null){
            return true;
        }
        else{
            int left = depth(root.left);
            int right = depth(root.right);
            if(Math.abs(left-right) <=1){
                return isBalanced(root.left) && isBalanced(root.right);
            }   
            return false;
            
        }
    }
    
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            int left = 1 + depth(root.left);
            int right = 1 + depth(root.right);
            
            if(left>right){
                return left;
            }
            return right;
                        
        }
        
    }
    
    
    
    
}
