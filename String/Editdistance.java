package com.String;
// Edit distance from is problem in which two string are given you have to conver s1 to s2 by insert remove and replace
public class Editdistance {



    static int min(int x,int y,int z){

        if(x<=y && x<=z)
            return x;
        if (y<=x && y<=z)

            return y;
        else
            return z;

    }
    static int editDistDp(String str1,String str2,int m,int n){

        //create table to store result of subproblem
        int dp[][] = new int[m+1][n+1];
        //fill d[][] in bottom up manner
        for (int i =0;i<=m;i++){


            for (int j =0; j<=n;j++){



                //if first string is empty only option is
                //to insert all character of second string

                if (i==0)
                    dp[i][j]=j; //min operation =j
                //if second string is empty only option is
                //to remove all charcter of second string
                else if (j==0)
                    dp[i][j]=i; //min operation =i

                //if last charcater are same ignore last
                //char and recur for remaining string
                else if (str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]= dp[i-1][j-1];

                //if the last character is different
                //consider all possibilities and find the
                //minimum
                else           //insert  remove replace
                    dp[i][j]= 1 + min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
            }
        }
        return dp[m][n];
    }
    //driver code

    public static void main(String [] args)
    {
        String str1 = "sunday";
         String str2 ="saturday";
        System.out.println(editDistDp(str1,str2,str1.length(),str2.length()));
    }
}
