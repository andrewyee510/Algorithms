/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class EditDistance {
    
        public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function

        if (word1.equals(word2)) return 0;
        int len1 = word1.length(), len2 = word2.length();
        if (len1 == 0) return len2;
        if (len2 == 0) return len1;
        
        int[][] dist = new int[len1 + 1][len2 + 1];
        dist[0][0] = 0;
        for (int i = 1; i <= len1; i ++){
            dist[i][0] = i;
        }
        for (int j = 1; j <= len2; j ++){
            dist[0][j] = j;
        }
        for (int i = 1; i <= len1; i ++){
            for (int j = 1; j <= len2; j ++){
                
                
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dist[i][j] = dist[i-1][j-1];
                }
                else{
                    int min =  Math.min(dist[i - 1][j] + 1, dist[i][j - 1] + 1);
                    dist[i][j] =Math.min( dist[i - 1][j - 1] + 1, min);
                }   
            }
        }
        return dist[len1][len2];
    }
    
}
