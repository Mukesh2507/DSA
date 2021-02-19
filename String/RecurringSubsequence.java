package com.String;
//longest repeating subsequence
//insubsequence order matters like abc should be in order but not in continues for
   public class RecurringSubsequence {


    static int longestRepeating (String str){
        int n = str.length();
        //create and initialize dp tale
        int[][] dp = new  int[n+1][n+1];
        //fill dp table
        for (int i =1 ;i<=n;i++){


            for (int j =1;j<=n;j++){

                //if character matches and index are not same
                if (str.charAt(i-1)==str.charAt(j-1) && i!=j){


                    dp[i][j]=1 + dp[i-1][j-1];
                }else{

                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }

            }

        }
        return dp[n][n];
    }

    public static void main(String[] args) {
        String str = "aabbcdd";
        System.out.println(longestRepeating(str));
    }





   }
