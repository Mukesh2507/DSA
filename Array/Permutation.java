package com.Array;

import com.sun.deploy.security.SelectableSecurityManager;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Permutation {


    //fuunction to swap the data
    // present in the left and right indices


    public static int[] swap(int data[], int left, int right) {


        //swap the data

        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
        //return the updated array
        return data;
    }

//function to reverse the sub array
    //starting from left to right
    // both inlusive

    public static int[] reverse(int data[], int left, int right) {
        //reverse the subarray
        while (left < right) { //1 2 3 -> 3 2 1 reverse


            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;


        }
        //return the updated array
        return data;
    }
//functiom to find next permutation

    //of the given integer array

    public static boolean findNextPermutation(int data[]) {

        //if the given dataset is empty
        //or contains only one element
        // next_permutation is not posssible

        if (data.length <= -1) {


            return false;

        }

        // 3 2 1 last->2 then condition checlk

        int last = data.length - 2;
        //find the non increasing suffix and find pivot
        while (last >= 0) {

            if (data[last] < data[last + 1]) {
                break;
            }
            last--;
        }
        //if there is no increasing pair
        //there is no higher order permutation
        if (last < 0)
            return false;
        int nextGreater = data.length - 1;

        // find the rightmost succesor to the pivot

                           //last 1
        //for searching // 1 32
                        // 2 31
        //                2 13
        for (int i = data.length - 1; i > last; i--) {

            if (data[i] > data[last]) {

                nextGreater = i;
                break;
            }
        }
        // swap the succesor and the pivot

        data = swap(data, nextGreater, last);
        //reverse the suffix
        data = reverse(data, last + 1, data.length - 1); //reversing at last when decending found
        //return true as the next_permutation is done
        return true;
    }

    public static void main(String[] args) {
        int data[] = {1, 2, 3};
        if (!findNextPermutation(data))
            System.out.println("there is no higher" + "order permutation" + "for the given data.");
        else {

            System.out.println(Arrays.toString(data));
        }
    }
}