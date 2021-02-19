package com.arrays;

public class QuickSort {


    public static void main(String[] args) {


        int[] arr = {15, 9, 7,13, 12, 16, 4, 18, 11};
        int leng = arr.length;
        QuickSort qsm = new QuickSort();  //creating object to call method
        qsm.quickSortRecursion(arr, 0, leng - 1);//recursion calling
        qsm.printArray(arr); //printing arrays


    }

    int partition(int[] arr, int low, int high) { //dividing array into two sub array

        int pivot = arr[(low + high) / 2]; //pivot as middle element pivot=12


        while (low <= high) { // explination low =0 and high 9|| low<high true 1<=9

            while (arr[low] < pivot) { //now a[0]=15 and pivot 12 condition false 15<12
                low++;
            }
            while (arr[high] > pivot) { //a[9]=11 and pivot =12 11>12 condtion false
                high--;

            }
            if (low <= high) { //hence condtion is false we sawp low and high  a[0]=11 and a[9] 15 so its look like 11|9|7|13|12|16|4|18|15
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }


    void quickSortRecursion(int[] arr, int low, int high) {
        int pi = partition(arr, low, high); //calling partion method
        if (low < pi - 1) { // pi=low=12 but we need  one less so pi-1
            quickSortRecursion(arr, low, pi - 1); //left subtree
        }
        if (pi < high) { 
            quickSortRecursion(arr, pi, high); //right subtree
        }
    }

    void printArray(int[] arr) {
        for (int item : arr) {

            System.out.println(item);
        }
    }
}


/*

 */