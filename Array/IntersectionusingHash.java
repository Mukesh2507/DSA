package com.Array;

import java.util.HashSet;

public class IntersectionusingHash {


    public static void main(String[] args) {


        int[] a = {4, 3, 7, 9, 2};
        int[] b = {5, 1, 4, 8, 3,}; //if one more 5 then take two hs in hs 1 uniq element

        HashSet<Integer> hs = new HashSet<>();

        for (int no : a
        ) {
            hs.add(no);
        }
        for (int no : b
        ) {
            boolean b1 = hs.add(no);


            if (b1 == false) {

                System.out.println(no);
            }

        }
    }
}
