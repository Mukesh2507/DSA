package com.String;

import java.util.Scanner;

//plaindrom means words read backword and forward same ex madam
public class Palindrom {
    public static void main(String[] args) {

        String str = "madam";

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {


            rev = rev + str.charAt(i);

        }
            if (str.equals(rev)) {
                System.out.println("palindrom");
            } else {
                System.out.println("not palindrom");
            }
        }
    }



