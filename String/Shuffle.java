package com.String;
//check whether given two string are valid shuffle or not//interleaving
// example str1 = xy and str 2 12 -> res x1y2 valid but x2y1 is not valid

 //condtion order preserved
// same character and length
public class Shuffle {

    public static void main(String[] args) {
        String first ="xy";
        String second ="12";
        String[] results ={"1xy2","y12x"};
        for (String result:results
             ) {
            if (shufflecheck(first,second,result)==true){
                System.out.println(result +"valid");
            }else{
                System.out.println(result+"not valid");
            }
        }

    }

    static  boolean shufflecheck(String first,String second,String result){


    //check the length of result is same as
        //sum of result of first and second
        if (first.length() + second.length() !=result.length()){

            return false;
        }
        //variable to track  each  character of 3 string
        int i =0,j=0,k=0; //first second third
        //iterate through all character of result
        while(k!=result.length()){
            //check if first character of result matches with first character of first string
            if (i<first.length() && first.charAt(i)==result.charAt(k))
                i++;
            else if (j<second.length() && second.charAt(j)==result.charAt(k))
                j++;

            //if character doesnt match
            else{

                return false;
            }
            //acess next character of result
            k++;


        }
    // after accessing all character of result
        //if either first or second has some character left
        if (i<first.length() || j <second.length()){

            return false;
        }
    return true;

    }
 }
