/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
import java.util.*;
public class Minimum_Depth_BinaryTree {
    
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(root == null){return 0;}
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);
        TreeNode temp;
        int level=1;
        int countpop =0;
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(temp==null){
                level++;
                if(!queue.isEmpty()){
                    queue.add(null);
                }
                
            }  
            else{
                if(temp.left==null && temp.right ==null){
                    return level;    
                } 
                if(temp.left != null){
                    queue.add(temp.left);    
                }
                if(temp.right != null){
                    queue.add(temp.right);   
                }

            
            }
        }
        return level;
        
        
        
    }
    
}
