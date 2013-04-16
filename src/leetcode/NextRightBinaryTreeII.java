/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class NextRightBinaryTreeII {
    public class TreeLinkNode{
        int val;
        TreeLinkNode left=null;
        TreeLinkNode right=null;
        TreeLinkNode next=null;        
    }
       public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function  
        if(root== null){return;}
        
        if(root.left !=null && root.right !=null){
            root.left.next = root.right;
            root.right.next = next(root.next);
        }
        else if(root.left!=null){
            root.left.next = next(root.next);
        }
        else if(root.right!=null){
            root.right.next = next(root.next);
        }  
        connect(root.right); 
        connect(root.left);
             
        return;
           
    }
    public TreeLinkNode next(TreeLinkNode node){
        
        while(node!=null){
            if(node.left!=null){
                return node.left;
            }
            else if(node.right!=null){
                return node.right;
            }
            node = node.next;            
        }
        return null;
        
        
    }
    
    
}
