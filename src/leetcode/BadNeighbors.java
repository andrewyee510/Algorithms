/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class BadNeighbors {
    
    public int badNeighbor(int[] num){
        if(num.length==0) return 0;
        if(num.length==1) return Math.max(0, num[0]);
        int A[] = new int[num.length];
        A[0] = num[0]; A[1] = Math.max(A[0], num[1]);
        for(int i=2; i< num.length; i++){
            A[i] = Math.max(A[i-1], num[i] + A[i-2]);
        }
        return A[num.length-1];
    }
    
    
}
