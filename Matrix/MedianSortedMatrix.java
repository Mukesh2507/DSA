package com.Matrix;

import java.util.Arrays;

//find the meadin row wise sorted matrix
//naive approch
//store the element of the given matrix in an array of size r*c o(r*c)
//sort the array  o(r*c*log(r*c))
//median = arr[(r*c)/2] o(1)
//t.c o(r*c*log(r*c))
public class MedianSortedMatrix {



   private static  int midianRowWiseSortedMatrix(int mat [] [] ,int r ,int c){

         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;

         for (int i =0;i<r;i++){

             //fiinding the minimum element
             if (mat[i][0]<min)
             min = mat[i][0];

//finding the maximum element
             if (mat[i][c-1]>max)

                 max = mat[i][c-1];
         }

          int desired_ = (r*c+1)/2;
         while(min <max)
         {

             int mid = min+(max-min)/2;

             int place =0;
             int get =0;

             //find count of element smaller than mid

             for (int i =0;i<r;++i){

                 get = Arrays.binarySearch(mat[i],mid);
                 //if element is not found in the array
                 // binary search method returns
                 //(-(insertion npoint )-1) so once we know
                 //the insertion point we can find elements
                 //smaller thsn the serarcvh element by the
                 //following calculation
                 if (get<0)
                     get =Math.abs(get)-1;
                 //if element is found in the array it returns
                 //the index so we got to last
                 //index of element which will give the number of
                 //elements smaller than the number including
                 //the searched element
                 else{


                     while(get <mat[i].length && mat[i][get]==mid)
                         get +=1;
                 }
                 place =place +get;
             }
             if (place<desired_)
                 min = mid +1;
             else
                 max = mid;
         }

          return min;


}


    public static void main(String[] args) {
        int r =3 ,c =3;
        int mat[][]= {{1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };
        midianRowWiseSortedMatrix(mat,r,c);

        System.out.println(  " " +midianRowWiseSortedMatrix(mat,r,c));


    }
     }

    

