package com.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rearrange {


    public static void main(String[] args) {

        int[] arr = {-1, 3, -4, 5, 7, -20, 40};
        int n = arr.length;


        rearrange(arr, n);

    }

    private static void rearrange(int[] arr, int n) {
        int i = 0, j = n - 1;
        while (arr[i] < 0 && i < j) {

            i++;

            while (arr[j] > 0 && i < j) {

                j--;

                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                    break;
                }
            }
        }
                System.out.println(Arrays.toString(arr));


            }
        }


