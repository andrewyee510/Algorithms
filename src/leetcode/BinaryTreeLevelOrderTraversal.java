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
public class BinaryTreeLevelOrderTraversal {
    
        public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> mList = new ArrayList<ArrayList<Integer>>(); 
        ArrayList<TreeNode> list = new ArrayList<TreeNode>(); 
        
        if(root ==null){return mList;}
        
        
        list.add(root);
        list.add(null);
        
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        
        while(list.size() != 0){
            TreeNode node = list.remove(0);
            if(node ==null){
                mList.add(newlist);                
                newlist = new ArrayList<Integer>();
                
                if(list.size() ==0){
                    return mList;
                }
                list.add(null);
                
            }else{
                newlist.add(node.val);
                if(node.left!=null){
                    list.add(node.left);
                }        
                if(node.right!=null){
                    list.add(node.right);
                }
            }

        }
        return mList;
        
    }
    
}
