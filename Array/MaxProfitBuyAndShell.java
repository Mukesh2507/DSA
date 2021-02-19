package com.Array;

public class MaxProfitBuyAndShell {




    static int maxProfit(int [] price,int n ){


        //buy - Money lent to buy stock
        //profit1-profit after selling
        //th 1st stock buyed
        //including profit of selling 1st stock
        //profit2 - profit after selling 2 stock

        int buy1,profit1,buy2,profit2;
        //set initial buying values to
        //Integer.max_vlue as we want to
        //minimise it
        buy1 = buy2=Integer.MAX_VALUE;
        //set initial selling value to
        //zero as we want to maximize it


        profit1 = profit2 =0;
        for (int i =0;i<n;i++){


            //money lent buy the stock
            //should be minimumas possible
            //stock to buy from 0 to i-1
            buy1 =Math.min(buy1,price[i]);

            //profit after selling a stock
            //should be maximum as possible
            //profit we can make from 0 to i-1
            profit1=Math.max(profit1,price[i]-buy1);
            //now for buying the 2 stock
            //we will integret profit made
            //from selling 1st stock
            buy2 =Math.min(buy2,price[i]-profit1);
            //profit after selling a 2 stock
            //should be maximum as posssible
            //profit2 track maximum possible
            //profit we can make from 0 to i-1
            profit2 = Math.max(profit2,price[i]-buy2);
        }
        return profit2;
    }

    public static void main(String[] args) {
        int price[] ={2,30,15,10,8,25,80};
        int n = price.length;

        System.out.println(maxProfit(price,n));
    }
}
