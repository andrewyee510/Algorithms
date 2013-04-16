/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class LongestPalindrome {
    
    public static boolean isPalindrome(String string){
        
        if(string.length() <=1){
            return true;
        }
        
        return string.charAt(0) == string.charAt(string.length() -1) && 
                isPalindrome(string.substring(1,string.length()-1));
        
    }
    
    
    public static String longestPalindrome(String string){
        
        for(int i=string.length(); i>0; i--){
            for(int j=0; j< string.length()-i ; j++){
                String subString = string.substring(j, j+i+1);
                if(isPalindrome(subString)){
                    return subString;
                }
            }                        
        }        
        return string;
    }
    
    
    public static void main(String []args){
        
        String string = "cabacddddddddd";
        System.out.println(longestPalindrome(string));
        
        
        
    }
    
}
