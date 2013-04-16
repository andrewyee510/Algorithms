/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class CircularLinkedList {
    
     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
      }
    
    public static ListNode findCircularNode(ListNode node){
        if(node==null){
            return node;
        }
        else{
            ListNode nodePtr1 =node;
            ListNode nodePtr2 = node;
            
            do{
                nodePtr1 = nodePtr1.next;
                nodePtr2 = nodePtr2.next.next;
                                
            }while(nodePtr1 != nodePtr2);
            
            ListNode nodePtr3 =node;
            while(nodePtr1 != nodePtr3){
                nodePtr1 = nodePtr1.next;
                nodePtr3 = nodePtr3.next;
            }
            
            return nodePtr3;
            
        }
        
        
    }
    
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second;
        
        ListNode circularNode = findCircularNode(head);
        System.out.print(circularNode.val);
        
    }
    
}
