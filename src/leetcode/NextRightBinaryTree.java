/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class NextRightBinaryTree {
    
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
            TreeLinkNode rightNode;
            if(root.next !=null){
                rightNode = root.next.left;
            }
            else{
                rightNode =null;
            }
            root.right.next = rightNode;
            connect(root.left);
            connect(root.right);
        }
        return;
        
        
    }
}
    

