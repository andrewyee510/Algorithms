/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class ClimbStairs {
        public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(n ==0){
            return 0;
        }    
        if(n > 2){
            return  climbStairs(n-2) + climbStairs(n-1); 
        }
        else if(n==2){
            return 2;
        }
        else if(n ==1){
            return 1 ;
        }
        return 0;
    }
    
}
