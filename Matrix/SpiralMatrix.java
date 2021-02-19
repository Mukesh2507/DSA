package com.Matrix;
//spiral traversal on matrix

public class SpiralMatrix {


    public static void main(String[] args) {
        int R = 3;
        int C = 6;

        int [][] mat = {{1,2,3,4,5,6},
                        {7,8,9,10,11,12},
                        {13,14,15,16,17,18},
                        };
        spiralPrint(R,C,mat);

    }

    private static void spiralPrint(int R, int C, int[][] mat) {

        int i,k=0,l=0;

        int last_row = R-1;
        int last_col = C-1;

        while(k<=last_row && l<=last_col)
        {
            for (i =l;i<=last_col;i++){

                System.out.println(mat[k][i]);

            }
            k++;
            for (i =k ; i<=last_row;i++) {


                System.out.println(mat[i][last_col]);

            }last_col--;
                if (k<=last_row){

                    for (i=last_row;i>=1;i--){

                        System.out.println(mat[i][l]);

                    }
                    l++;
                }
            }
        }



    }



