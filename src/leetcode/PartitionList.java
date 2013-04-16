/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class PartitionList {
    
    public static class ListNode{
        int val;
        ListNode(int x){
            val =x;
        }
        ListNode next;
    }
    
    public static void printList(ListNode node){
        while(node!=null){
            System.out.print( node.val+ " ");
            node = node.next;
        }
    }
    
    public static ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function

        ListNode topStart = new ListNode(0);
        ListNode bottomStart = new ListNode(0);
        ListNode bottom = bottomStart;
        ListNode top = topStart;
        
        while(head!=null){
            if(head.val < x){
                bottom.next = head;
                bottom = bottom.next;
            }
            else{
                top.next = head;
                top = top.next;
            }
            head = head.next;
            
        }
        top.next = null;
        bottom.next = null;
        bottom.next = topStart.next;
        return bottomStart.next;

    
    }
    
    
    
    public static void main(String [] args){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
       
        second.next = null;
        first.next = third;
        //third.next = second;
        partition(first, 2);
        
        
    }
    
}
