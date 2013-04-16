/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class SurroundedRegions {
     public void solve(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(board.length==0) return;
        int x = board.length-1;
        int y = board[0].length-1;
        for(int i=0; i<=x; i++){
            if(board[i][0] == 'O') bfs(board, i, 0);
            if(board[i][y] == 'O') bfs(board, i, y);
        }
        for(int i=1; i<y; i++){
            if(board[0][i] == 'O') bfs(board, 0, i);
            if(board[x][i] == 'O') bfs(board, x, i);
        }
        
        for(int i=0; i<=x; i++){
            for(int j=0; j<=y; j++){
                if(board[i][j] == 'O') board[i][j] ='X';
                else if(board[i][j] =='I') board[i][j] ='O';
            }
        }        
    }
    
    public void bfs(char[][] board, int x, int y){
        if(x <0 || y< 0 || x >= board.length|| y >= board[0].length) return;
        
        if(board[x][y]=='O'){
            board[x][y] = 'I';
            bfs(board, x-1, y); 
            bfs(board, x+1, y);
            bfs(board, x, y-1);
            bfs(board, x, y+1);
        }    
    }
    
}
