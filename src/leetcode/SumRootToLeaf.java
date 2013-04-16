/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return sumNumbers(root, 0);
    }
    
    public int sumNumbers(TreeNode root, int sum){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return sum*10+ root.val;
        int left = sumNumbers(root.left, sum*10 + root.val);
        int right = sumNumbers(root.right, sum*10 + root.val);
        
        return left+right;
    }
}
