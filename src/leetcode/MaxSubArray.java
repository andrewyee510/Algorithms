/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class MaxSubArray {
    public int maxSubArray(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max=Integer.MIN_VALUE;
        int sum =0;
        for(int i =0; i<A.length;i++){
            sum +=A[i];
            max = (max<sum)? sum: max;
            if(sum<=0){
                sum=0;
            }
        }
        return max;
    }
    
}
