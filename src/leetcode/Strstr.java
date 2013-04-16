/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class Strstr {
    
    public static String strstr(String str, String sub){
        
        for(int i=0; i <str.length()-sub.length(); i++){
            
            if(str.charAt(i) == sub.charAt(0)){
                for(int j=1; j< sub.length(); j++){
                    if(str.charAt(i+j) != sub.charAt(j))
                        break;
                }
                return sub;
            }
        }
        
        
        return "";
    }
    
}
