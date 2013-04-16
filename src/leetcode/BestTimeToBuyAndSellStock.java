/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class BestTimeToBuyAndSellStock {
    
    
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(prices.length ==0){return 0;}
        
        int prev=prices[0];
        int max = Integer.MIN_VALUE;
        int current;
        int total=0;
        for(int i=1; i< prices.length; i++){
            current = prices[i];
            
            if(current > prev){
                prev = Math.min(prev,prices[i-1]);             
                total = Math.max(total, current -prev);
            }
            else{
                prev = current;
            }
            
           
            
            
        }            
        return total;
    }

    
}
