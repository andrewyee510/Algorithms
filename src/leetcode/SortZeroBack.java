package leetcode;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class SortZeroBack {
    
    public static void sortZero(int []A){
        int start=0;
        int end=0;
        if(A.length <=1){
            return;
        }
        
        for(int i =0; i<A.length; i++){
            if(A[i] == 0){
                int j=i;
                while(A[j] == 0 && j <A.length-1){
                    j++;
                }
                A[i] =A[j];
                A[j] =0;               
            }
                        
        }
        
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] +" ");
        }
               
    }
    
    public static void main(String [] args){
        int [] A = {0,2,0,4,0,5,0,0,0};
        sortZero(A);
        System.out.println();
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        
    }
       
    
}
