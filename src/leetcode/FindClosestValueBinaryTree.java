/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class FindClosestValueBinaryTree {
    
    public static class TreeNode {
      double val;
      TreeNode left;
      TreeNode right;
      TreeNode(double x) { val = x; }
   }
    
    
    public static double find(TreeNode root, double k){
        double x = findHelper(root, k);
        return x;
    }
    
    public static double findHelper(TreeNode root, double k){
        
        if(root==null){
            return Double.MAX_VALUE;
        }
        
        double left = findHelper(root.left, k);
        if(root.val == k){
            return root.val;
            
        }
        double right = findHelper(root.right, k);  
        double min = (Math.abs(left-k) >Math.abs(right-k))? right: left;
        min = (Math.abs(root.val-k) >Math.abs(min-k))? min: root.val;
        return min;
    }
    
    public static void main(String[] args){
        
        TreeNode five = new TreeNode(5.0);
        TreeNode six = new TreeNode(6.0);
        TreeNode six_nine = new TreeNode(6.9);
        TreeNode three_two = new TreeNode(3.2);
        TreeNode four_two = new TreeNode(4.2);
        
        five.left = three_two;
        three_two.right = four_two;
        five.right = six_nine;
        six_nine.left = six;
        
        System.out.println(find(five, 4.9));
        
    }
}
