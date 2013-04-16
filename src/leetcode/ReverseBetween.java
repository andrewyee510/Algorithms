/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class ReverseBetween {
     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
     }    
     public static ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(head==null){return head;}
        if(m == n){return head;}
        ListNode prev = null;
        ListNode next;
        ListNode g = new ListNode(0);
        g.next = head;
        ListNode x = g;
        ListNode current = x;
        int count =0;
        
        ListNode curTail = null;
        ListNode curHead = null;
        while(current!=null && count != m){
            count++;
            prev = current;
            current = current.next;
            
        }
        curTail = prev;
        prev =null;
        while(current!=null && count != n+1){
            if(curHead ==null){
                curHead = current;
            }
            count++;
            next = current.next;
            current.next = prev;
            prev = current;
            current =next;
        }

        curHead.next = current;
        curTail.next = prev;
        return x.next;
    }
     
     public static void printList(ListNode node){
         while(node!=null){
             System.out.print(node.val + " ");
             node = node.next;
        }
         
     }
     
     
     public static void main(String []args){
         ListNode one = new ListNode(1);
         ListNode two = new ListNode(2);
         ListNode three = new ListNode(3);
         ListNode four = new ListNode(4);
         ListNode five = new ListNode(5);
         ListNode six = new ListNode(6);
         
         one.next = two;/*
         two.next = three;
         three.next = four;
         four.next = five;
         */
         //printList(one);
         reverseBetween(one,1,2);
         printList(two);
         
     }
    
}
