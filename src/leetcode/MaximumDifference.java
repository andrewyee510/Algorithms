/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class MaximumDifference {
    
    public static int maxDiff(int []a){
        if(a.length == 0 || a.length ==1){return 0;}
        int min = a[0];
        int current = Integer.MIN_VALUE;
        int total =Integer.MIN_VALUE;
        int prev = a[0];
        for(int i=1; i<a.length; i++){
            
            current = a[i];
            if(current > min){
                min = Math.min(a[i-1], min);
                prev = min;
                total = Math.max(total, current-min);
            }
            else{//prev
                min = current;
            }
            System.out.println("current=" + current + " min="+ min+ " total="+ total);
        }
    return total;
    }
    
    public static void main(String args[]){
        int [] a = {2,3,0,6,4,8,1};
        int [] b = {7,9,5,6,6,9};
        System.out.println(maxDiff(b));
        
        
    }
    
}
