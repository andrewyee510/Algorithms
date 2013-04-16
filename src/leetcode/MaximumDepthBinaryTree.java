/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) {return 0;}
        int right =1 + maxDepth(root.right);
        int left = 1 + maxDepth(root.left);
        return Math.max(right, left);
    }
    
}
