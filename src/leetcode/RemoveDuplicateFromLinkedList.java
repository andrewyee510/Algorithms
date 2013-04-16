/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class RemoveDuplicateFromLinkedList {
    
    
    
      public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
      }
      
       public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
       ListNode current = head;
       ListNode prev=null;
        

        while(current!=null){ 
                
            if(prev!=null && prev.val == current.val){
                prev.next = current.next;
            }
            else{
                prev = current;
            }
            current = current.next;
        }

        return head;
    }
    
}