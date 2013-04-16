/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class Cent {
    
    
    public static int sum(int n) {
        if(n<0) return 0;
        if(n==0)return 1;
        return sum(n-25)+ sum(n-10)+ sum(n-5) +sum(n-1);
    }
    
    public static int changes(int total, int coin){
        if(coin == 1) return 1;
        int next_coin = 1;
        int way=0;
        switch(coin){
            case 25:
                next_coin = 10;
                break;
            case 10:
                next_coin = 5;
                break;
        }
        for(int i =0; i* next_coin <= total; i++){
            way += changes(total - i * coin, next_coin);
        }
        return way;
    }
    
    
    
}
