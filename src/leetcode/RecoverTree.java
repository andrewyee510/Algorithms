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
public class RecoverTree {
    
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      
      }
        public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(root == null){return;}
        
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        addNode(list, root);
        int prev = 0;
        for(int i=1; i < list.size(); i++){
            if(list.get(i).val < list.get(prev).val){
                break;
            }
            else{
                prev =i;
                
            }            
        }
        
        int temp = prev+1;
        for(int i=temp+1; i < list.size(); i++){
            if(list.get(i).val < list.get(temp).val){
                temp = i;                  
            }    
        }
        int value2 = list.get(temp).val;
        list.get(temp).val = list.get(prev).val;
        list.get(prev).val = value2;
        
    }
    
    
    public void addNode(ArrayList<TreeNode> list, TreeNode node){
        
        if(node== null){return;}
        addNode(list,node.left);
        list.add(node);
        addNode(list,node.right);
    }
    
}
