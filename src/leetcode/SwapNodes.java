/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
       
        
        ListNode prev = new ListNode(0);
        ListNode temp = prev;
        ListNode current = head;
        prev.next = current;
        while(current!=null && current.next!=null){
            ListNode next = current.next.next;
            prev.next = current.next;
            current.next.next = current;
            current.next = next;
            prev = current;
            current = next;
        }
        return temp.next;
    }
    
}
