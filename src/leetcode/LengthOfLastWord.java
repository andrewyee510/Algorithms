/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.

 * @author Andrew
 */
public class LengthOfLastWord {
    
    
     public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        
     int count=0;
     int empty =0;
     if(s.length() ==0){
         return 0;
     }
     
     int start = 0;
     for(int i =s.length()-1; i>=0 ; i--){

        
        if(s.charAt(i)!=' '){
            if(start==0){
                start++;
            }
            count++; 
        } 
   
        if(s.charAt(i)==' '){
            if(start==1){
                return count;
            }
            
        }

     
     }   
        
    return count;    
        
    }
    
}
