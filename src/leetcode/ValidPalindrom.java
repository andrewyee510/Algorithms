/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start =0;
        int end = s.length()-1;
        s =s.toLowerCase();
        while(start < end){
            boolean isS = Character.isLetterOrDigit(s.charAt(start));
            boolean isE = Character.isLetterOrDigit(s.charAt(end));
            if(!isS){
                start++; continue;
            }else if(!isE) {end--; continue;}
            if(s.charAt(start) == s.charAt(end)){
                start++; end--;
                continue;
            }
            return false;
        }
        
        return true;
    }
    
}
