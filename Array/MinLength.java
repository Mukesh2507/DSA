package com.Array;


//smalllest sub array with given sum greter than or equal to value
/*given an array with k =11

 arr ={7,2,1,1,6,5}
 so ans is {6,5}

 brute force approch by using to nestred for loops
 i =0
  j= i

  int min length = Integer_maxvalue
  int sum =0
  sum += arr[i]

  if(Sum >=k){

    minlength = math.min (minlenght,(j-i)+1)

 break;


 return minlength== integer max value ) ? 0 :minlength;



 */


//optimised solution
public class MinLength {
    public static void main(String[] args) {
        int[] arr = {7,2,1,1,6,5};

        int n = arr.length;

          int k =11;

        System.out.println(minlength(arr,n,k));


    }

    private static int minlength(int[] arr, int n, int k) {

        int start=0 ;
        int end =0;
        int minlength =Integer.MAX_VALUE;
        int sum =0 ;
        for (end =0; end <n;end++){

            sum = sum +arr[end];

            while(sum >=k && start<=end){

                 minlength =Math.min(minlength,(end-start)+1);

                 sum = sum -arr[start++];
            }
        }
        return (minlength== Integer.MAX_VALUE) ? 0: minlength;
    }

}
