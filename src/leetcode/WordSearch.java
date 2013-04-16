/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author Andrew
 */
public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(board.length==0) return false;
        if(word.length()==0) return true;
        boolean path[][]=new boolean[board.length][board[0].length];
        for(int i =0;i<board.length;i++)
            for(int j =0;j<board[0].length;j++)
                if(helper(board,path, word, i,j))
                    return true;
        return false;
    }
    public static boolean helper(char[][]board, boolean[][]path, String word, int i, int j){
        if(board[i][j]!=word.charAt(0)) return false;
        
        if(word.length()==1) return true;
        path[i][j]=true;
         
        if(i+1<board.length && !path[i+1][j] && helper(board,path,word.substring(1),i+1,j))
            return true;
        if(i-1>=0 && !path[i-1][j] && helper(board,path,word.substring(1), i-1,j))
            return true;
        if(j+1<board[0].length && !path[i][j+1] && helper(board,path,word.substring(1),i,j+1))
            return true;
        if(j-1>=0 && !path[i][j-1] && helper(board,path,word.substring(1), i,j-1))
            return true;        
        path[i][j] = false;
        return false;
    }
    
    
    
    public static boolean exist2(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        boolean path[][]=new boolean[board.length][board[0].length];
        for(int i =0;i<board.length;i++)
            for(int j =0;j<board[0].length;j++)
                if(exist(board, path, word, i,j))
                    return true;
        return false;
    }
    
    public static boolean exist(char[][]board, boolean[][] grid , String word, int x, int y){
        if(word.length()==0) return true;
        if(x <0 || x>=board.length || y<0 || y>=board[0].length) return false;
        if(word.charAt(0)==board[x][y] && grid[x][y]==false){
            grid[x][y] = true;
            return exist(board, grid, word.substring(1), x+1, y) ||
                   exist(board, grid, word.substring(1), x-1, y) ||
                   exist(board, grid, word.substring(1), x, y+1) ||
                   exist(board, grid, word.substring(1), x, y-1);
        }
        grid[x][y] =false;
        return false;
    } 
    
    public static void main(String []args){
        
        char [][]A = {{'a','a'}};
        System.out.println(A.length + " " + A[0].length);
        //System.out.println(A[1][0]);
        System.out.println(exist2(A, "aa"));
        //System.out.println(exist(A ,"aa"));

        
    }

    
}
