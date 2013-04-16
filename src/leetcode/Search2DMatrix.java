/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class Search2DMatrix {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        
        int row = 0;
        int col = matrix.length-1;
        
        
        while(row < matrix[0].length && col >=0){
            
            if(matrix[col][row] == target){return true;}
            else if(matrix[col][row] < target){
                row++;
            }    
            else{
                col--;
            }        
            
        }
        return false;
        
    }
    
}
