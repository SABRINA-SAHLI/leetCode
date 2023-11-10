package org.arrays;

public class Problem_121_Max_Profit {

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int buyingDay = 0;
        for(int i = 1; i< prices.length;i++){
            if(prices[buyingDay] > prices[i]){
                buyingDay = i;
            }else{
                int profit = prices[i] - prices[buyingDay];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }


    public static void main(String[]args){
        int[]prices={2,1,5,3,6,8};
        System.out.println(maxProfit(prices));
    }
}
