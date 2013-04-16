/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.util.*;
/**
 *
 * @author Andrew
 */
public class FlattenBinaryTree {
    
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }   
        public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(root == null){return;}
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode head = new TreeNode(0);
        TreeNode tail = head;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
            temp.left = null; 
            tail.right = temp;
            tail = temp;
        }
                
        
        
    }
    
}
