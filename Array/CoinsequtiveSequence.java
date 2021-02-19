package com.Array;

import java.util.HashSet;
//here we are using has set because hash set remove duplicasy
//meaning 1 2 3 4
public class CoinsequtiveSequence {


    public static void main(String[] args) {
        int[] a = {1, 2, 3,4, 5, 6, 8, 9};
        int n = a.length;


        largeSequence(a, n);
        System.out.println(largeSequence(a, n));

    }

    private static int largeSequence(int[] a, int n) {


        HashSet<Integer> hs = new HashSet<>();


        for (int i = 0; i < a.length; i++) {

            hs.add(a[i]);

        }

        int longest = 0;

        for (int i = 0; i < a.length; i++) {

            if (!hs.contains(a[i] - 1)) {

                int no = a[i];


                while (hs.contains(no)) {

                    no++;
                }
                if (longest < (no - a[i])) {

                    longest = no - a[i];

                }

            }

        }return longest;

    }

}