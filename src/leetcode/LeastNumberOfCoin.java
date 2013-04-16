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
public class LeastNumberOfCoin {
    
    public static int least(int[]coins, int n){
        
        Arrays.sort(coins);
        int[] A = new int[n+1];
        int min =0;
        for(int i=1; i<A.length; i++){
            int j=0;
            min =10000000;
            while(j<coins.length && coins[j] <= i ){
                min = Math.min(A[i-coins[j]]+1, min);
                j++;
            }
            A[i]= min;
        }
        
        for(int i=0; i<A.length; i++){
            System.out.println(A[i]);
        }
        
        if(A[n-1] <0) return 0;
        return A[n];
    }   
    
    public static void main(String[] args){
        int[] coins = {2,5,10,25};        
        System.out.println(least(coins, 11));
    }
}
