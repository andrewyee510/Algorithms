/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class BestTimeToBuyAndSellStockII {
        public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length ==0){return 0;}
        
        int prev=prices[0];
        int current=0;
        int total=0;
        int start = prices[0];
        
        for(int i=1; i< prices.length; i++){
            current = prices[i];
        
            if(prices[i-1]> current){
                total += prices[i-1] -start;
                start = current;
            }
            if(i == prices.length-1){
                if(prices[i-1] <current){
                    total += current -start;
                }
            }


        }        
        return total;
    }
    
}
