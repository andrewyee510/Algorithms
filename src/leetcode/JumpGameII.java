/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class JumpGameII {
    
    public static int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==1){return 0;}
        
        int max = A[0];
        int min = 1;
        int step =0;
        int m=0;
        while(max< A.length-1){
            m = max;
            for(int i=min; i<=max; i++){
                if(m < A[i] +i){
                    m = A[i] +i;
                } 
                
            }
            min = max+1;
            max = m;
            step++;
        }
    
        return step+1;  
    }
    
    
    public static void main(String [] args){

        int a[]= {3,4,3,2,5,4,3};       
        jump(a);
    }
    
}
