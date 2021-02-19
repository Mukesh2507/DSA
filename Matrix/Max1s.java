package com.Matrix;
//find row with maximum no of 1s
public class Max1s {
    public static void main(String[] args) {
        int mat[][] = {{0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1,},
                {0, 0, 0, 0}};
        int r = 4;
        int c = 4;

        System.out.println(rowWithMax1s(mat,r,c));

    }

    private static int first(int[] arr,int low ,int high) {


        if (high >= low) {
            //get the middle index
            int mid = low + (high - low) / 2;

            //chec if the element at middle index is first 1
            if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1)
                return mid;
                //if the element is 0 recure for right side
            else if (arr[mid] == 0)
                return first(arr, (mid + 1), high);
            else
                return first(arr, low, (mid - 1));

        }
        return -1;
    }

    private static   int rowWithMax1s(int [][] mat,int r,int c){

    int max_row_index = 0 ,max = -1;


    int i ,index;
    for (i =0;i<r;i++){


        index = first(mat[i],0,c-1);
        if (index !=-1 && c-index >max){

            max = c-index;
            max_row_index=i;
        }
    }
    return max_row_index;

    }
}

