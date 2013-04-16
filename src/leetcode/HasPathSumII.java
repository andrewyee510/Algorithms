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
public class HasPathSumII {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();        
        int depth = depth(root);
        if(root ==null){return mainList;}
        int A[] = new int[depth];
        Psum(root, sum, mainList, A, 0);
        return mainList;    
    }
    
    
    public void Psum(TreeNode root, int sum, ArrayList<ArrayList<Integer>> mainList, int []A, int level) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) {return;}
        A[level] = root.val;
        sum = sum - root.val;
        if(sum == 0 && root.left == null && root.right == null){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i =0; i <= level; i++){
                list.add(A[i]);
            }
            mainList.add(list);
        }
        Psum(root.left, sum,mainList, A , level+1);
        Psum(root.right, sum, mainList, A , level+1);                 
        return;
        
    }    
    
    public int depth(TreeNode root){
        
        if(root ==null){return 0;}
        int left = 1+depth(root.left);
        int right = 1+depth(root.right);
        return Math.max(left, right);
        
    }
    
}
