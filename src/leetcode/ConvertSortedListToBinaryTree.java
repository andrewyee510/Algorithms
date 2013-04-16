/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class ConvertSortedListToBinaryTree {
    ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null) return null;
        ListNode current = head;
        node = head;
        int size=0;
        while(current!=null){ size++; current=current.next; }
        return build(0, size-1);
    }
    
    public TreeNode build(int start, int end){
        if(start>end) return null;
        int mid = start + (end-start)/2;
        TreeNode left = build(start, mid-1);
        TreeNode current = new TreeNode(node.val);
        current.left = left; node = node.next;
        current.right = build(mid+1,end);
        return current;
    }
    
}
