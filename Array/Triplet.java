package com.Array;
//find the triplet that sum to a given value

/*given array is {12,3,4,1,6,9}
 sum =24
   ans is 12+3+9
   true
 */


import java.util.Arrays;

public class Triplet {


    public static void main(String[] args) {


        int[] a = {12, 3, 4, 1,9};
        int n = a.length;
  int sum =24;
        System.out.println(triplet(a, n,sum));
    }
//o(n^3)

   // public static boolean triplet(int[] a, int n) {


     //   for (int i = 0; i < n; i++) {

       //     for (int j = i + 1; j < a.length; j++) {

         //       for (int k = i + 1; k < a.length; k++) {


           //         int ans = 24;

             //       if (a[i] + a[j] + a[k] == 24) {

               //         System.out.println("  " +a[i] +", " +a[j] + "," +a[k]);

                 //       return true;

                   // }
                //}

            //}


              //    }
    //    return false;
    //}
//}



//o(n^2)
     public static boolean triplet(int [] a,int n ,int sum ){



    int i,r;
    //sort the element
         Arrays.sort(a);


    for (i =0;i<a.length;i++){
        i = i+1;
        r = n-1;
        while(i<r) {

            if (a[i] + a[1] + a[r] == sum) {
                System.out.println(a[i] + "" + a[1] + "" + a[r]);
                return true;
            } else if (a[i] + a[1] + a[r] < sum) {
                i++;

            } else {
                r--;
            }
        }



    }
         return false;

    }
}