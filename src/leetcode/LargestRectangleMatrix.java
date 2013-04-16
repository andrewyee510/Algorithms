/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
         
        int height = matrix.length;
        int width = matrix[0].length;
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
 * @author Andrew
 */
import java.util.*;

public class LargestRectangleMatrix {
    
    public static int maximalRectangle(char[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (matrix.length == 0) {
            return 0;
        }
        int height = matrix.length;
        int width = matrix[0].length;
        int area = 0;
        int h[] = new int[width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                int count=0;
                int k=0;
                while(k<=i && matrix[k][j]=='1'){
                    count++;       
                    k++;
                }
                h[j] = count;
            }
            area = Math.max(area, largestRectangleArea(h));
            for(int l=0; l<h.length; l++){
                h[l] =0;
            }
            
        }
        
        return area;
        
    }



    public static int largestRectangleArea(int[] height) {
        Stack<Integer> stack = 
            new Stack<Integer>();
        int max = 0;
        int i = 0;
        while(i < height.length) {
            if(stack.isEmpty() || 
                height[i] >= stack.peek()) {
                stack.push(height[i]);
                i++;
            }
            else {
                int count = 0;
                while(!stack.isEmpty() && 
                    stack.peek() > height[i]) {
                    count++;
                    int top = stack.pop();
                    max = Math.max(max, top * count);
                }
                for(int j = 0; j < count + 1; ++j) {
                    stack.push(height[i]);
                }
                i++;
            }
        }
        
        int count = 0;
        while(!stack.isEmpty()) {
            count++;
            max = Math.max(max, stack.pop() * count);
        }
        return max;
    }
    
    
    public static void printMatrix(char [][] matrix){
        
        int height = matrix.length;
        int width = matrix[0].length;
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args){
        char matrix[][]={{'0','1','1','1'},{'1','1','1','1'},{'0','1','1','1'},{'0','1','1','0'}};      
        printMatrix(matrix);
        System.out.println(maximalRectangle(matrix));
        
    }
    
}
