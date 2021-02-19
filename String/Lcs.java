package com.String;
//longest common subsequence is the method in which order of character is matter not need if they are not contiunues
// for example aabbcedd str 2 =>aabbcedd  so in this lcs is abd because they are matching
//if you find intersect then its not subsequence
//dyanamic approch
public class Lcs {

    static int lcs(char[] X, char[] Y, int m, int n) {

        {
            int L[][] = new int[m + 1][n + 1];

            for (int i = 0; i <= m; i++) {


                for (int j = 0; j <= n; j++) {


                    if (i == 0 || j == 0)//means if no string character are matching or zero

                    {

                        L[i][j] = 0;
                    } else if (X[i - 1] == Y[j - 1])// means if character match
                    {

                        L[i][j] = L[i - 1][j - 1] + 1; //means if character match we add on that postion 1
                    } else {

                        L[i][j] = max(L[i - 1][j], L[i][j - 1]);
                    }
                }

            }


            return L[m][n];
        }
    }

     static int max(int a, int b) {
        return (a>b) ? a:b;
    }

    public static void main(String[] args) {
        String s1 ="AGGTAB";
        String s2 ="GXTXAYB";
        char [] X = s1.toCharArray();
        char[] Y =s2.toCharArray();
        int m = s1.length();
        int n = s2.length();
        System.out.println("length is " +lcs(X,Y,m,n));
    }


}
