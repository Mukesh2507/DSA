package com.Array;

import java.util.HashSet;

public class SubarrayIntoOtherArray {

    public static void main(String[] args) {


        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};

        System.out.println(contains(a, b));
    }

    private static boolean contains(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();
        int m = a.length;
        int n = b.length;
        for (int i = 0; i < m; i++)
            if (!hs.contains(a[i])) {

                hs.add(a[i]);
            }
        for (int i = 0; i < n; i++) {

            if (!hs.contains(b[i])) {

                return false;
            }
            return true;
        }

   return contains(a,b);
    }
}