package com.Matrix;
//searching element of sorted matrix
public class SearchElement {

    public static void main(String[] args) {

        int [][] mat = {{1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
        };
        int l = mat.length;
        int m = 3 ;
        int n= 6;

        searchElement(mat,m,n);
    }

    private static int searchElement(int[][] mat, int m, int n ) {
        int s = 10;

        int i =0 , j=n-1;
        while(i<n && j>=0){

            if (s==mat[i][j]){


                System.out.println("found");
                return s ;
            }
            else if(s<mat[i][j]){
                j--;
            }
            else{
                i++;
            }
        }



return s;
    }


}
