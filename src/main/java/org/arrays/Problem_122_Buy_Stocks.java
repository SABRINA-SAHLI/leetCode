package org.arrays;

public class Problem_122_Buy_Stocks {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=1; i<prices.length;i++){
            if(prices[i]-prices[i-1]>0)
                maxProfit += prices[i]-prices[i-1];

        }
        return maxProfit;
    }


    public static void main(String[]args){

        int[] prices = {1,2,3,4,5};
        System.out.println("Max profit :"+maxProfit(prices));
    }
}
