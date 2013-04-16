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
public class SpiralMatrix {
        public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix.length==0) return list;
        spiral(matrix, matrix.length, matrix[0].length, 0, list);
        return list;
    }
    
    public void spiral(int[][]matrix, int x, int y, int k, ArrayList<Integer> list){
        
        if( x<=0 || y<=0) return;
        
        if(x==1){
            for(int i=0; i<y; i++){
                list.add(matrix[k][k+i]); 
            }
            return;
        }
        if(y==1){
            for(int i=0; i<x; i++){
                list.add(matrix[k+i][k]); 
            }
            return;
        }
        
        for(int i=0; i<y; i++){
            list.add(matrix[k][k+i]);
        }
        for(int i=1; i<x-1; i++){
            list.add(matrix[k+i][k+y-1]);
        }
        for(int i=y-1; i>=0 ; i--){
            list.add(matrix[k+x-1][k+i]);
        }
        for(int i=x-2; i>=1; i--){
            list.add(matrix[k+i][k]);
        }
        spiral(matrix, x-2, y-2, k+1, list);
        
        
    }
    
}
