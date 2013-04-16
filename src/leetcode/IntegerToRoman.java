/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String digit[] = new String[]{"", "I","II","III","IV", "V","VI","VII","VIII","IX"};
        String ten[] = new String[]{"", "X","XX","XXX","XL","L","LX","LXX", "LXXX","XC"};
        String hundred[] = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String thousand []= new String[] {"", "M", "MM", "MMM"};
        StringBuffer result = new StringBuffer();
        if(num >3999)
            num = 3999;
        if(num<0)
            num = 0;
        result.append(thousand[num/1000]);
        result.append(hundred[num/100 %10]);
        result.append(ten[num/10 %10]);
        result.append(digit[num%10]);
        return result.toString();
            
    }
}
