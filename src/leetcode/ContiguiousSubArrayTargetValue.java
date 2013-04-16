/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class ContiguiousSubArrayTargetValue {
    
    public static int[] subArray(int[] A, int target){
        if(A.length == 0){ return new int[0];}
        
        int start=0;
        int sum =0;
        int end =0;
        
        while(sum != target ){
            if(sum >target && start < A.length){
                sum-= A[start];
                System.out.println("Subtract "+ A[start] + " sum " + sum);
                start++;
            }else if(sum < target && end < A.length){
                sum+=A[end];
                System.out.println("Add "+ A[end] + " sum " + sum);
                end++;
            }    
            else{
                break;
            }
        }
        
        if(sum!= target){
            return new int[0];
        }
        int newA[] = new int[end-start];
        for(int i=0; i <(end-start); i++){
            newA[i] = A[i+start];
        }
        
        return newA;
    }
    
    public static void main(String []args){
        int[] A = {1,5,2,4,6};
        int []newA = subArray(A,12);
        System.out.println(newA.length);
        for(int i=0; i<newA.length; i++){
            System.out.print(newA[i] + " ");
            
        }
        
    }
    
    
}
