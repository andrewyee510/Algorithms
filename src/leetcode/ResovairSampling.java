/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class ResovairSampling {
    
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            this.val = x;
        }
    }
    
    public int[] sampling(ListNode head, int k){
        int[] A = new int[k];
        ListNode ptr = head;
        int i=0;
        for(; i< A.length; i++ ){
            A[i] = ptr.val;
            ptr = ptr.next;
        }
        
        while(ptr!=null){
            int rand  = (int)Math.random() * i;
            if(rand < k){
                A[rand] = ptr.val;
            }
            ptr = ptr.next;
        }
        return A;
    }
    
    
}
