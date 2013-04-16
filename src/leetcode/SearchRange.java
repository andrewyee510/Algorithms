/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class SearchRange {
    
    public int[] searchRange(int[] A, int target) {
        int start =0, end = A.length-1; 
        int []range = {-1,-1};
        

        while(start<=end){
            int mid = start + (end-start)/2;
            if(A[mid]==target){
                int count =mid;
                while(mid-1>=0 && A[mid-1]==target){mid--;}
                range[0] = mid;
                mid = count;
                while(mid+1 <=A.length-1 && A[mid+1]==target){mid++;}
                range[1] =mid;
                return range;
                
            }else if(A[mid]< target) start = mid+1;
            else end = mid-1;
        }
        return range;
    }
    
    
}
