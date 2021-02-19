package com.Array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

// q.2 finding max and min in array
public class MaxMin {


    public static void main(String[] args) {

        int[] arr = {3, 7, 5, 6, 8};

        int n = arr.length;

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min) {

                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

