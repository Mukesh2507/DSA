package com.String;
//count and say problem
/*
1 then we read as one one 11 then 21 then we read as 1211 then 111221
 */

public class CountAndSayProblem {


    public static void main(String[] args) {

        int n =4;
        System.out.println(countAndSay((n)));
    }
    public static String countAndSay(int n){

        String val = "1";//start with one
        for (int i=0;i<n;i++){

            char c =val.charAt(0); //so now c is became 1
            StringBuilder s = new StringBuilder();
            int countt =1;

            for (int j =1;j<val.length();j++){


                if (c!=val.charAt(j)){ //intial length is one so directly go for append

                    s.append(countt);
                    s.append(c);
                    countt=0;
                    c=val.charAt(j);
                }
                countt++;
            }

            s.append(countt);
            s.append(c); //append c
            val=s.toString();
        }
        return val;

    }








}
