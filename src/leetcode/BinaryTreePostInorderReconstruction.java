/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class BinaryTreePostInorderReconstruction {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return build(inorder, postorder, 0, postorder.length-1, postorder.length-1);
    }
    
    public TreeNode build(int[] inorder, int[] postorder, int start, int end, int pID){
        if(start>end) return null;
        TreeNode current = new TreeNode(postorder[pID]);
        int i =0;
        while(i<=inorder.length && postorder[pID]!=inorder[i]) i++;
        current.left =  build(inorder, postorder, start, i-1, pID-end+i-1);
        current.right = build(inorder, postorder, i+1, end, pID-1);
        return current;
    }
    
}
