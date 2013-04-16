/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class LeastCommonAncestor {
    
    public static TreeNode LCA(TreeNode root, int A, int B){
        if(root ==null){return root;}
        else{
            if(root.val == A || root.val == B){
                return root;
            }
            TreeNode left = LCA(root.left, A, B);
            TreeNode right = LCA(root.right , A, B);
            if(left!=null && right!=null){
                //root is the middle, because A, and B are opposite sides
                return root;
            }
            TreeNode temp = (left!=null)?left: right;
            return temp;
        }    
    }
    public static TreeNode LCAncestor(TreeNode root, int A, int B){
        if(root ==null){return root;}
        else{
            if(root.val == A || root.val == B) return root;
            boolean left = cover(root.left, A);
            boolean right = cover(root.right, B);
            
            if(left == right) return root;
            
            if(left){
                return LCAncestor(root.left, A, B);
            }
            return LCAncestor(root.right,A, B);
        }    
    }
    
    public static boolean cover(TreeNode root, int x){
        if(root==null){return false;}
        else{
            if(root.val == x) return true;
            return cover(root.left, x) || cover(root.right, x);
        }
    }
    
    
    
    public static void main(String[] args){
         /*   
     1
    / \
  2     3
 / \   / \
4   5 6   7
     \
      8
 */
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        one.left = two; 
        one.right= three;
        two.left= four;
        two.right= five;
        three.left = six;
        three.right =seven;
        five.right = eight;
        
        System.out.println(LCA(one, 8, 4).val);
        
        System.out.println(LCAncestor(one, 4, 8).val);
    }
    
}
