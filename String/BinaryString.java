package com.String;
//split the binary string into two substring with equals 0's and 1's
public class BinaryString {

    public static void main(String[] args) {
        String str = "0100110101";
        int n = str.length();
        System.out.println(MaxSubstring(str,n));
    }
    public static  int MaxSubstring(String str,int n){

        int x =0 ,y=0;
        int c =0 ;
        for (int i =0 ;i<n ;i++){

            if (str.charAt(i)=='0') {
                x++;
            }
            else{
                y++;
            }
            if (x==y){
                c++;
            }
        }
        if (x!=y){
            return -1;

        }
        return c;
    }
}
