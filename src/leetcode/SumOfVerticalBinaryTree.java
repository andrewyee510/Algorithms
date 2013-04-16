/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**

     1
    / \
  2     3
 / \   / \
4   5 6   7

The tree has 5 vertical lines

Vertical-1: nodes-4     => vertical sum is 4       
Vertical-2: nodes-2     => vertical sum is 2
Vertical-3: nodes-1,5,6 => vertical sum is 1+5+6 = 12
Vertical-4: nodes-3     => vertical sum is 3
Vertical-5: nodes-7     => vertical sum is 7

We need to output: 4 2 12 3 7
 */
public class SumOfVerticalBinaryTree {
    
    public static void find (TreeNode node){
        int length = height(node) *2 -1;
        int A[] = new int [length]; 
        sumVertical(node, length/2, A);
        
    }
    public static void sumVertical(TreeNode node, int index, int [] A){
        if(node==null){
            return;
        }
        A[index] = A[index] + node.val;
        sumVertical(node.left, index-1, A);
        sumVertical(node.right, index+1, A);
                        
    }    
    
    public static int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = 1+ height(node.left);
        int right = 1+ height(node.right);
        return Math.max(left,right);
    }
    
    public static void main(String []args){
     /*   
     1
    / \
  2     3
 / \   / \
4   5 6   7
        
 */
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        
        one.left = two; 
        one.right= three;
        two.left= four;
        two.right= five;
        three.left = six;
        three.right =seven;
        find(one);
        
        
    }
    
}
