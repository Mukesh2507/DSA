package com.String;
//longest palindrome in string||longest palindrom substring
public class LongestPalinndrome {
    //recursive approch
    /*
    in this approch start > end mens return zero and start ==end then only one element so return 1

    now if string ababa so here a=a start=end
    means character matching
              4-0-1=>3
     */
    public static int lpSubstring(String str, int start, int end) {
        if (start > end) {
            return 0;

        }
        if (start == end) {

            return 1;

        }
        if (str.charAt(start) == str.charAt(end)) { //so here check the condition then it execute the lpsubstring

            int lpsRemainingString = end - start - 1;
            if (lpsRemainingString == lpSubstring(str, start + 1, end - 1)) {
                // 3 =3
                // 2+3=>5

                return 2 + lpsRemainingString;
            }
        }

        return Math.max(lpSubstring(str, start + 1, end), lpSubstring(str, start, end - 1)); //divides into sub parts
    }//tc 0(2^n)because two recursive call


    //dp top down approch
     public static int lpSubstringTopDown(String str,int start,int end,Integer[][] arr){

        if (start>end){

            return 0;
        }
        if (start==end){
            return 1;
        }
        if (arr[start][end]==null) {
            if (str.charAt(start) == str.charAt(end)) {

                int lpsRemainingString = end - start - 1;
                if (lpsRemainingString == lpSubstringTopDown(str, start + 1, end - 1, arr)) {

                    arr[start][end] = 2 + lpsRemainingString;
                }
            } else {

                arr[start][end] = Math.max(lpSubstringTopDown(str, start, end - 1, arr), lpSubstringTopDown(str, start + 1, end, arr));
            }
        }
            return arr[start][end];

     }




    public static void main(String[] args) {
        String str = "adada";
        System.out.println(LongestPalinndrome.lpSubstring(str,0,str.length()-1));
        Integer [][] arr =new Integer[str.length()][str.length()];

        System.out.println(LongestPalinndrome.lpSubstringTopDown(str,0,str.length()-1,arr));
    }
}





