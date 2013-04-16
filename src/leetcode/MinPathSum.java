/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
 * @author Andrew
 */
public class MinPathSum {
    
    
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return sum(grid, grid.length-1,grid[0].length-1);
        
    }
    
    
    public int sum(int[][] grid, int x, int y){
          
        if(x==0 && y==0){
            return grid[0][0];
        }
        else{
            
            if(x==0){
                return grid[0][y] + sum(grid, x, y-1);
            }
            else if(y==0){
                return grid[x][0] + sum(grid, x-1, y);
            }
           
            int right = sum(grid, x-1, y);
            int down = sum(grid, x, y-1);

            return grid[x][y] + Math.min(right,down);
        }       
        
    }
    
    
    
   
    public int minPathSum2(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(grid[0].length==0 && grid.length ==0){
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] cost = new int[m][n];
        cost[0][0] = grid[0][0];
        
        for(int i=1; i<m; i++){
            cost[i][0] = cost[i-1][0] + grid[i][0];
            
        }
        
        for(int i=1; i<n; i++){
            cost[0][i] = cost[0][i-1] + grid[0][i];
        }
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                int value = Math.min(cost[i][j-1], cost[i-1][j]);
                cost[i][j]= grid[i][j]+ value;                
            
            }
        
        }
        return cost[m-1][n-1];    
        
    }

}
