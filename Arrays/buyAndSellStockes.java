import java.util.*;
public class buyAndSellStockes {
    public static int buy_And_Sell(int prices[]){
        int buyPrices = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrices < prices[i]){
                int profit = prices[i] - buyPrices;
                maxprofit = Math.max(maxprofit,profit);
        }else{
            buyPrices = prices[i];
        }
    }
        return maxprofit;

    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buy_And_Sell(prices));
    }
    
}
