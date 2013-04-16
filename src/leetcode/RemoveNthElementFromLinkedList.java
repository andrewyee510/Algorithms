/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class RemoveNthElementFromLinkedList {

    public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
          val = x;
          next = null;
          }
     }
      public static class LinkedList{

            
            ListNode head;
            public void insert(int value){
                
                if(head==null){
                    head = new ListNode(value);
                }
                else{
                    ListNode nodePtr = head; 
                    while(nodePtr.next!=null){
                        nodePtr = nodePtr.next; 
                    }
                    nodePtr.next = new ListNode(value);
                }
            }
            
            public void print(){
                ListNode curr = head;
                while(curr!=null){
                    System.out.println(curr.val);
                    curr = curr.next;
                }                
            }
            public void removeNthElement(){
                removeNthFromEnd(head,1);
            }
            
      
      }

    
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head.next == null) return null;
        ListNode current = head;
        for (int i =0; i<n; i++)
            current = current.next;
       
        ListNode temp = new ListNode(1);
        temp.next =head;
        ListNode prev = temp;
        while(current !=null){
            current = current.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return temp.next;
        
        
    }
        
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        //list.insert(8);
        list.print();
        System.out.println();
        list.removeNthElement();
        list.print();
    

     }  
    
}
