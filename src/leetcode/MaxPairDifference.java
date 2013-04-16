/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class MaxPairDifference {
    
    public static int maxPair(int A[]){
        
        int max = Integer.MIN_VALUE;
        int diff = 0;
        
        for(int i =0; i<A.length; i++){
            max = Math.max(max, A[i]);
            diff = Math.max(diff, max- A[i]);            
        }
        return diff;
    }
    
    public static void main(String [] args){
        int []A = {1 ,4, 8,5,4,2,10,6};
        int value  = maxPair(A);
        System.out.println(value);
    }
}
