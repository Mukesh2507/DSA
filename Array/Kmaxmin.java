package com.Array;
//q.3 find kth max and min element in arrayv
//for finding kth position element max then sort in decending order and for min sort in ascending order
public class Kmaxmin {


    public static void main(String[] args) {

        int[] arr = {5, 8, 12, 7, 6, 2, 4};
        int n = arr.length;
        int k = 4;


        for (int i = 0; i < arr.length - 1; i++) {


            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) { //sorting into decending because 0th largest is 12 and then 1 th largse is 8..
                                       //for kth smallest element sort in ascending order use >
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }
            }


                if (i == k - 1) {

                    System.out.println(k + "largest elemnet is " + arr[i]);
                    break;
                }

            }
        System.out.println("_______________");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }


        }


    }

