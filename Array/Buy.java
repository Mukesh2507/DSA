package com.Array;


import java.util.Arrays;

// days m t w t f s
// 7 1 5 3 6 4
//min 7 1 1 1 1 1
//profit 0 0 4 2 5 3
public class Buy {

    public static int maxProfit(int[] price) {
        if (price.length == 0) return 0;

        int min = price[0];
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            min = Math.min(min, price[i]);
            maxProfit = Math.max(maxProfit, price[i] - min);

        }
        return maxProfit;

    }

    public static void main(String[] args) {

     //  int [] price = {7,1,5,3,6,4};
   int [] price = {2,30,15,10,8,25,80};
          int n = price.length;
        System.out.println(maxProfit(price));

    }


    }










