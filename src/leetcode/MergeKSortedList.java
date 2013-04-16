/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.util.*;
/**
 *
 * @author Andrew
 */
public class MergeKSortedList {
        public ListNode mergeKLists(ArrayList<ListNode> lists) {
        
        if(lists.size() ==0){
            return null;
        }
        
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(), new compareQ());
        
        ListNode head;
        for(ListNode l : lists){
            if(l !=null) queue.add(l);
        }
        
        head = queue.peek();
        ListNode node = new ListNode(0);
        ListNode prev = node;
        ListNode curr ;
        while(queue.size() >0){
            curr = queue.remove();
            if(curr.next!=null){
                queue.add(curr.next);
            }
            prev.next = curr;
            prev = curr;
            
        }
        
        
        return head;
        
        
    }
    
    
    public class compareQ implements Comparator<ListNode> {
        
        @Override
        public int compare(ListNode a, ListNode b){
            if(a.val >b.val){
                return 1;
            }
            else if(a.val <b.val){
                return -1;
            }
            return 0;
        }
   
    }
    
    
}
