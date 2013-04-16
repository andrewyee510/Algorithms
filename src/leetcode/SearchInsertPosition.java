/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class SearchInsertPosition {
    
    
    public static int searchInsert(int[] A, int target) {
        int i = bs(A, target);
        if (i != -1 && A[i] == target) {
            return i;
        }
        else {
            return i+1;
        }
    }
//return the index of the biggest element smaller than or equal to x
//if any element in a is bigger than x, return -1
//the following is used often, just remember it.
    public static int bs (int[] a, int x) { 
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        int ret = -1;
 
        while (start <= end) {
            mid = (start +end)/2;
            if (a[mid] > x) {
                end = mid-1;

            }
            else {
                start = mid+1;
                ret = mid;

            }
        }
 
        return ret;
    }
    
    
    public static void main(String [] args){
        int A[] = {1,3,4,5,7,9};
        
        System.out.println(searchInsert(A,9));
    }
    
}
