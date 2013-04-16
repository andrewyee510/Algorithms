/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.util.*;
/**
 *
 * @author Andrew
 */
public class IP {
        public ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list = new ArrayList<String>();
        dfs("",list ,s, 0);
        return list;
    }
    
    
    public void dfs(String buffer, ArrayList<String> list, String IP, int count){
        if(count==3){
            if(validate(IP)){ 
                list.add(buffer +IP);}
            return;
        }else{
            for(int i=1; i<=4 && i<=IP.length(); i++){
                if(validate(IP.substring(0,i))){
                    int value = Integer.valueOf(IP.substring(0,i));
                    dfs(buffer+value + ".", list, IP.substring(i), count+1);  
                }
                      
            }
        }
                
    }
    
    public boolean validate(String value){
        if(value.length() <=0 || (value.charAt(0) =='0' && value.length()>1)) return false;
        int x = Integer.valueOf(value);
        if(x>=0 && x<=255) return true;
        return false;
    }
    
}
