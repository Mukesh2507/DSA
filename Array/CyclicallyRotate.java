package com.Array;

//q.7 CyclicallyRotate array
public class CyclicallyRotate {


    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5};

        rotate(a, a.length);
        int n = a.length;

    }

    private static void rotate(int[] a, int length) {

        int n = a.length;

        for (int i =0;i<=n-1;i++){
            System.out.println(a[i]);

        }
    }


}
