/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 Given an array and a value, remove all instances of that value in place and return the new length.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * @author Andrew
 */
public class RemoveElement {
    
    
       public static int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function       
        int i =0;
        int j = A.length-1;
 
        while(i<=j){
            if(A[i]==elem){
                if(A[i]!=A[j]){
                    A[i]=A[j];
                    i++;
                    j--;
                }
                else{
                    j--;
                }
                
            }
            else
                i++;
        }
        return i;    
    }
       
       
               
        
        
     public static void main(String[] args){

        System.out.println("First Test");
        int []A = {0,0};
        removeElement(A,0);
    

     }       
    
}
