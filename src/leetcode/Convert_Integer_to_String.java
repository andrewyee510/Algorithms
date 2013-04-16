/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class Convert_Integer_to_String {
    
    public static int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        char sub;
        int convert = 0, total =0;
        int sign =1, signcount =0;
        for(int i=0; i<str.length(); i++){           
            sub = str.charAt(i); //1 char
            if(sub==' '){
                continue;
            }
            else if(sub=='-'){
                sign = -1;
                signcount++;
            }
            else if(sub=='+'){
                sign = 1;
                signcount++;
            }
            else if(signcount >=2){
                return 0;
            }
            else{
                if(sub=='1'||sub=='2'||sub=='3'||sub=='4'||sub=='5'||sub=='6'||sub=='7'||sub=='8'||sub=='9'||sub=='0'){
                    
                    convert = sub -'0';       
                    total = total + convert*(int)Math.pow(10,str.length()-i-1);
                }
                else{
                    total = total / (int) Math.pow(10,str.length()-i);
                    return total *sign;
                }
            }
      
        }
 
        
        return total*sign;
        
        
    }
    
    public static void main(String []args){
        String number = "asd-123";
        System.out.println(atoi(number));
        int value = 2 + ('3'-'0');
        System.out.println(value);
        
    }
    
    
    
}
