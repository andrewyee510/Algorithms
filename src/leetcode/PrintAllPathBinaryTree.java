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
public class PrintAllPathBinaryTree {
  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  
 public static LinkedList<TreeNode> deepcopy(LinkedList<TreeNode> list)  {
     LinkedList<TreeNode> newList = new LinkedList<>();
     for(TreeNode t: list){
         TreeNode temp = new TreeNode(t.val);
         newList.add(temp);
     }
     return newList;
 }
  
  
  public static void paths(TreeNode root, LinkedList<TreeNode> list){

      if(root==null){ return;} 
      list.add(root);

      if(root.left==null && root.right == null){
          printPath(list);
      }
      else{
          if(root.left!=null && root.right!=null){
              paths(root.left, list);
              paths(root.right,deepcopy(list));
          }
          else if(root.left!=null){
              paths(root.left, list);
          }
          else if(root.right!=null){
              paths(root.right, list);
          }
      }
  }  
  
  private static void printPaths(TreeNode node, int[] path, int pathLen) { 
  if (node==null) return;

  // append this node to the path array 
  path[pathLen] = node.val; 
  pathLen++;

  // it's a leaf, so print the path that led to here 
  if (node.left==null && node.right==null) { 
    printArray(path, pathLen);  
  } 
  else { 
  // otherwise try both subtrees 
    printPaths(node.left, path, pathLen); 
    printPaths(node.right, path, pathLen); 
  } 
}
  
  
  public static void printPath(LinkedList<TreeNode> list){
      for(TreeNode t: list){
          System.out.print(t.val+ " ");
      }
      System.out.println();
      
  }
  private static void printArray(int[] ints, int len) { 
  int i; 
  for (i=0; i<len; i++) { 
   System.out.print(ints[i] + " "); 
  } 
  System.out.println(); 
} 
  
  public static void main(String []args){
      TreeNode one = new TreeNode(1);
      TreeNode two = new TreeNode(2);
      TreeNode three = new TreeNode(3);
      TreeNode four = new TreeNode(4);
      TreeNode five = new TreeNode(5);
      TreeNode six = new TreeNode(6);
      TreeNode seven = new TreeNode(7);
      
      
      one.left = two;
      one.right = three;
      two.left = four;
      two.right = five;
      three.left = six;
      six.right = seven;
      
      paths(one, new LinkedList<TreeNode>());
      
      int[] path = new int[1000]; 
       //printPaths(one, path, 0); 
  }
  
  
  
  
}
