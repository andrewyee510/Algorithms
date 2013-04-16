/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class ConvertArrayToBinaryTree {
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return build(num,0, num.length-1);
    }
    
    public TreeNode build(int[] num, int start, int end){
        if(start>end)return null;
        int mid = start + (end-start)/2;
        TreeNode left = build(num, start, mid-1);
        TreeNode current = new TreeNode(num[mid]);
        TreeNode right = build(num, mid+1, end);
        current.left = left; current.right = right;
        return current;
    }
}
