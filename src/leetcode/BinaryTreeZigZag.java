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
public class BinaryTreeZigZag {
        public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root ==null) return mainList;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean reverse = false;
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove();
            
            if(temp==null){
                mainList.add(list);
                if(queue.isEmpty()){
                    continue;
                }
                list =  new ArrayList<Integer>();
                queue.add(null);   
                reverse = (reverse)? false:true;
            }
            else{
                if(reverse){
                    list.add(0, temp.val);
                }
                else{
                    list.add(temp.val);
                }
                if(temp.left!=null) {
                    queue.add(temp.left);
                }
                if(temp.right!=null) {
                    queue.add(temp.right);
                }
            }
        }
                return mainList;
        
    }
    
}
