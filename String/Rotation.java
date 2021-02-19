package com.String;
//to check whether the string is rotated or not must satisfied three condition 1.same lenght 2. same character 3.rotated around each of the character
public class Rotation {

    public static void main(String[] args) {


        System.out.println( isRotatedVerwsion("abcd","bcda"));


    }

   public static boolean isRotatedVerwsion(String str,String rotatedString){


        if (str==null || rotatedString ==null){

            return false;
        }else if (str.length()!=rotatedString.length()){

             return false;
        }else{

            String concatenated = str+str;
            return concatenated.contains(rotatedString);
        }




   }

}
