/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class RemoveDuplicatesFromArray {
        public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return 0;
        int i =0,j=1;
        while(j<A.length){
            if(A[i]==A[j])
                j++;
            else{
                A[++i] =A[j++];
            }
        }
        return i+1;
        
        
    }
    
}
