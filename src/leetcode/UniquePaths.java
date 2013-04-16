/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(m ==0 && n ==0){
            return 0;
        }
        
        
        return paths(m,n,1,1);
        
        
    }
    
    public int paths(int m, int n, int x, int y){
        
        if(x == m && y == n){
            return 1;
        }
        if(x==m){
            return paths(m,n,x,y+1);
        }
        else if(y==n){
            return paths(m,n,x+1,y);
        }
        return paths(m,n,x+1,y) + paths(m,n, x, y+1); 

    }
    
        public int pathsDynmic(int m, int n, int x, int y){
        
        int a[][] = new int [m][n];
        
        for(int i=0; i<m; i++){
            a[i][0] = 1;
        }
        for(int i=1; i<n; i++){
            a[0][i] = 1;
        }
        
        for(int i=1; i<m; i++){
            for(int j=1; j< n; j++){
                a[i][j] = a[i][j-1] + a[i-1][j]  ;              
            }
            
        }
        return a[m-1][n-1];
    }
}
