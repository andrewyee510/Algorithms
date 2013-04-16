/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class ReverseLinkedList {
    
    public static ListNode reverse(ListNode node){
     
        if(node==null) return node;
        ListNode current;
        ListNode head = current = node;
        ListNode prev = null;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    } 
    
    public static ListNode reverseRecursive(ListNode previous, ListNode current){
        if(current == null)
            return null;
        ListNode temp = reverseRecursive(current, current.next);
        if(temp== null) temp = current;
        current.next = previous;
        return temp;
    }
    
    public static void printList(ListNode node){
        while(node!=null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
    
    
    public static void main(String[] args){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next = two;
        two.next = three;
        
        printList(reverseRecursive(null,one));
        
    }
}
