/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class AddBinary {
    
    public static String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
int len =  Math.min(a.length(), b.length());
        String shorter;
        if(a.length() != b.length()){
            if(a.length() > len){
                shorter = b;
                len = a.length() -b.length();
            }
            else{
                shorter = a;
                len = b.length() -a.length();
            }
            len = Math.abs(len);
            
            for(int i =0; i< len; i++){
                shorter = '0' + shorter;
            }
           
            if(a.length() > b.length()){
               b= shorter;
            }
            else{
               a=shorter;
            }
            System.out.println(b + " " + a);
        }
        
        len =  Math.max(a.length(), b.length());
        int carry = 0;
        String result ="";
        for(int i=len-1; i >= 0; i--){
            if(a.charAt(i) == '0' && b.charAt(i)=='1' && carry == 0){
                result = "1" + result;
            }
            else if(a.charAt(i)=='0' && b.charAt(i)=='1' && carry == 1){
                result = "0" + result;
                carry =1;
            }
            else if(a.charAt(i) == '1' && b.charAt(i)=='0' && carry == 0){
                result = "1" + result;
            }
            else if(a.charAt(i) == '1' && b.charAt(i)=='0' && carry == 1){
                result = "0" + result;
                carry =1;
            }
            else if(a.charAt(i) == '1' && b.charAt(i)=='1' && carry == 0){
                result = "0" + result;
                carry = 1;
            }
            else if(a.charAt(i) == '1' && b.charAt(i)=='1' && carry == 1){
                result = "1" + result;
                carry = 1;
            }
            else if(a.charAt(i) == '0' && b.charAt(i)=='0' && carry == 0){
                result = "0" + result;
            }
            else if(a.charAt(i) == '0' && b.charAt(i)=='0' && carry == 1){
                result = "1" + result;
                carry = 0;
            }
            System.out.println(result);
        }
        
        if(carry ==1){
            result = "1" + result;
        }

        return result;  
    }
    
    
    public static void main(String []args){
                String s = "Andrew";
        int len = s.length()-1;
        System.out.println(s.substring(0,len));
        addBinary("11","1");
    }
}
