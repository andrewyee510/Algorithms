/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class AddTwoNumbers {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int carry =0;
        ListNode prev = new ListNode(0);
        ListNode current= prev;
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val +carry;
            carry = sum/10;
            if(sum >9){
                sum = sum-10;
            }
            current.next = new ListNode(sum);
            current = current.next;
            l1 = l1.next; l2 = l2.next;
        }
        while(l1!=null){
            int sum = l1.val + carry;
            carry = sum/10;
            if(sum >9){
                sum=sum-10;
            }
            current.next =  new ListNode(sum);
            current = current.next;
            l1 = l1.next;
        }    
        while(l2!=null){
            int sum = l2.val + carry;
            carry = sum/10;
            if(sum >9){
                sum=sum-10;
            }
            current.next =  new ListNode(sum);
            current = current.next;
            l2 = l2.next;
        }    
        if(carry ==1) current.next = new ListNode(1);
        return prev.next;
    }
    
}
