/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class LengthOfLongestSubstring {
    
        public static int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() 
        
        if(s.length() == 0){
            return 0;
        }
        
        
        int array[] = new int[256];
        int length =0;
        int j=0;
        char c;
        for(int i=0; i <s.length(); i++){
            c = s.charAt(i);
            if(array[c] >0){   
                while(c != s.charAt(j)){
                    
                    char tempChar = s.charAt(j);
                    array[tempChar] =0;
                    j++;
                    
                }
                length = Math.max(i -j, length);
                j++;

            }else{
                array[c] = 1;                
            }

              
            
        }
        return Math.max(length,s.length()-j);
        
    }
    
}
