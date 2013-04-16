/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class Merge2LinkedList {

        
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
    public static void printList(ListNode node){
        while(node!=null){
            System.out.print( node.val+ " ");
            node = node.next;
        }
    }
    
    
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        
        if(l1 ==null){return l2;}
        else if(l2 == null){return l1;}
        
        
        if(l1.val >l2.val){
            head = l2;
            l2 = l2.next;
        }else{
            head = l1;
            l1 = l1.next;
        }
        ListNode tail = head;
        
        while(l1 != null || l2 != null){
            if(l1 == null){
                tail.next = l2;
                return head;                
            }
            else if(l2 == null){
                tail.next = l1;
                return head;
            }        
            
            if(l1.val >l2.val){
                tail.next = l2;
                l2 = l2.next;
            }else{
                tail.next = l1;
                l1 = l1.next;
            }
            tail = tail.next;
            
        }  
        return head;
    }
    
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(l1==null) return l2;
        else if(l2==null) return l1;
        
        ListNode head;
        ListNode current,prev;
        if(l1.val < l2.val){ 
            head = l1; 
            l1=l1.next;
        }else{
            head= l2;
            l2=l2.next;
        }
        current = head;
        while(l1!=null && l2!=null){
            
            if(l1.val<l2.val){
                current =l1;
                l1=l1.next;
            }else{
                current = l2;
                l2=l2.next;
            }

            current = current.next;
        }
        if(l1==null) {current.next = l2;}
        else if(l2==null) {current.next =l1;}
        return head;
    }
    
    
    
    public static void main(String []args){
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(1);
        printList(mergeTwoLists2(one,two));
        System.out.println();
      //  printList(mergeTwoLists(one,two));
        
    }
}
