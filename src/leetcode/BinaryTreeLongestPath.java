/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class BinaryTreeLongestPath {
    int max =0;
    public int longest(TreeNode root){
        if(root==null) return 0;
        int left = longest(root.left);
        int right = longest(root.right);
        max = Math.max(left +right+1, max);
        return Math.max(left,right)+1;
    }
    
}
