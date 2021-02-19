package com.Matrix;


//print the element in row column wise sorted matrix

public class SortedMatrix {

    static final int INF = Integer.MAX_VALUE;
    static final int N =4;



    static void youngify(int mat[][],int i,int j) {

        //find the value at down and right sides of mat [i][j]
        int dowVal = (i + 1 < N) ?
                mat[i + 1][j] : INF;
        int rightVal = (j + 1 < N) ?
                mat[i][j + 1] : INF;

        //if mat[i][j] is gthe down right corner element
        //return

        if (dowVal == INF && rightVal == INF) {


            return;
        }
        //move the smaller of two values
        //(dowVal and rightVal) to mat[i][j]

        //and recur for smaller value

        if (dowVal < rightVal) {

            mat[i][j] = dowVal;
            mat[i + 1][j] = INF;
            youngify(mat, i + 1, j);
        } else {


            mat[i][j] = rightVal;
            mat[i][j + 1] = INF;
            youngify(mat, i, j + 1);
        }
    }

    static int extactMin(int mat[][]) {

        int ret = mat[0][0];
        mat[0][0] = INF;
        youngify(mat, 0, 0);
        return ret;

    }

    static void printSorted(int mat[][])
    {


        System.out.println("Element of matrix in sorted order n");
        for (int i=0;i<N*N;i++){

            System.out.println(extactMin(mat) +" ");
        }
    }


    public static void main(String args[]){

        int mat[][] ={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };

        printSorted(mat);
    }


}
