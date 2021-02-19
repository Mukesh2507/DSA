package com.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class
SetOfDigit {

    //naive approch

    public static void NGE(int arr[],int n){

        int next,i,j;
        for (i=0;i<n;i++){


            next =-1;
            for (j=i+1;j<n;j++){


                if (arr[i]<arr[j])
                {

                    next=arr[j];
                    break;
                }
            }
            System.out.println("next greater are"  +arr[i] +" "+next);
        }



    }


    public static void main(String[] args) {
        int arr[]={11,13,21,3};
        int n =arr.length;
        NGE(arr,n);
    }



}
//next approch stack

 //public class SetOfDigit{

   // static void swap (char ar[],int i ,int j){


    //    char temp =ar[i];
      //  ar[i]=ar[j];
        //ar[j]=temp;
    //}

    //static void findNext(char ar[],int n){



      //  int i;
        //for ( i=n-1;i>0;i--){

          //  if (ar[i]>ar[i-1]){

            //    break;
            //}
        //}


        //if (i==0){

          //  System.out.println("not posssible");
        //}
        //else{

          //  int x = ar[i-1],min=i;



            //for (int j=i+1;j<n;j++){

              //  if (ar[j]>x && ar[j]<ar[min])
                //{
                  //  min =j;
                //}
            //}
            //swap(ar,i-1,min);

            //Arrays.sort(ar,i,n);
            //System.out.println("next greater number wityh same" + "set of digit is ");
            //for ( i=0;i<n;i++){

              //  System.out.println(ar[i]);
        //    }
        //}
   // }

    //public static void main(String[] args) {
      //  char digits[] = {'5','3','4','9','7','6'};
       // int n =digits.length;
        //findNext(digits,n);
   // }
//}

