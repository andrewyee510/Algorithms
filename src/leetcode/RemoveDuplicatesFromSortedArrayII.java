/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class RemoveDuplicatesFromSortedArrayII {
        public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length <1)
            return 0;
        int head=0, next = 1;
        boolean visit=false;
        while(next<A.length){
            if(A[head] !=A[next]){
                head++;
                A[head] = A[next];
                visit = false;
            }
            else{
                if(!visit){
                    head++;
                    A[head] = A[next];
                    visit = true;
                }
            }
            next++;
        }
        return head +1;
    }
}
