package com.arrays;

public class SelectionSort {


    public static void main(String[] args) {

        int a[] = {3, 1, -2, 7, 4, 0};
        int n = a.length;


        for (int i = 0; i < n - 1; i++) { // for pass


            int minIndex = i;

            for (int j = i + 1; j < n; j++) {  //for traversing element loop
                                                 // work again and again
                                               // inital j =1 then j=2


                if (a[j] < a[minIndex]) {
                    minIndex = j;


                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;


        }
        for (int item : a
        ) {
            System.out.println(item);
        }
    }
}

//
//        for (int i=0;i<n-1;i++){

  //      int minInd=i;
        //for (int j=i+1;j<n;j++){

    //    if(a[j]<a[minInd]){
      //  minInd=j;
        //}
        //}
        //int temp =a[i];
       // a[i] = a[minInd];
        //a[minInd]=temp;
        //}
        //for (int item: a) {
        //System.out.println(item);

        //}
        //}
        //}
