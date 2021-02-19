package com.arrays;

public class QuickSort1{

    public static void main(String[] args) {

        int[] arr = {50, 30, 10, 90, 80, 20, 40, 70};
        int len = arr.length;

        QuickSort qsm = new QuickSort();
        qsm.quickSortRecursion(arr, 0, len - 1);
        qsm.printArray(arr);
    }

    int partition(int[] arr,int low,int high) {

        int pivot = arr[low];

        while (low <= high) {

            while (arr[low] <= pivot) {

                low++;
            }
            while (arr[high] >= pivot) {

                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;

            }
        }
        return low;
    }
        void quickSortRecursion ( int[] arr, int low, int high){

            int pi = partition(arr, low, high);

            if (low < pi - 1) {

                quickSortRecursion(arr, low, pi - 1);
            }

            if (pi < high) {
                quickSortRecursion(arr, pi, high);

            }

        }
        void printArray ( int[] arr){
            for (int item : arr) {

                System.out.println(item);
            }


        }


    }









