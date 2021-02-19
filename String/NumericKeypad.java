package com.String;
//convert a sentence into its equivalent mobile numeric keypad sequence
public class NumericKeypad {

    static  String printSequence(String arr[],String input){

        String output=" ";
        //length of input string
        int n = input.length();
        for (int i =0;i<n;i++){

            //checking for space

            if (input.charAt(i)==' '){
                output =output + 0;
            }
            else{

                //caluclate index for each charcter
                int postion = input.charAt(i)-'A';
                output =output + arr[postion];
            }
        }

        //output sequnce
        return output;

    }


    public static void main(String[] args) {
        //Storing the sequence array


        String str[] = {"2","22","222",
                        "3","33","333",
                         "4","44","444",
                          "5","55","555",
                         "6","66","666",
                         "7","77","777","7777",
                          "8","88","888",
                          "9","99","999","9999"};
        String input ="GEEKSFORGEEKS";
        System.out.println(printSequence(str,input));
    }






}
