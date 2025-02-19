import java.util.*;

public class buysellstock {
    public static int buyAndsellstocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0;i<prices.length;i++){
            if(buyPrice < prices[i]){ //profit
            int profit = prices[i] - buyPrice; //today's profit
            maxProfit = Math.max(maxProfit,profit);
        } else {
            buyPrice = prices[i];
        }
    }
        return maxProfit;
    }

   public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndsellstocks(prices)); // 1 buy and 6 sell

   }// profit = 5
}

