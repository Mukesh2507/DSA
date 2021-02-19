package com.Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// union and intersection of two sorted array
public class Unionintersection {


    public static void main(String[] args) {


        int[] a = {10, 20, 30};
        int[] b = {40, 60, 70, 80};
        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];


        for (int i = 0; i < a.length; i++) {


            c[i] = a[i];

        }
        for (int j = 0; j < b.length; j++) {


            c[a.length + j] = b[j];
        }
        for (int i = 0; i < c.length; i++) {


            System.out.println(  c[i] +"  " );
        }
    }
}

