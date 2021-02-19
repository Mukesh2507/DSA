package com.String;

import java.util.*;

//Word break problem
/*  like we have given dictionary word loves
                                        pep
                                        coding
                                        ice
                                        cream
                                        man
                                        go
                                        mango
    p e p c o d i n g l o v e s m a n g o  i c e c r e a m
    0 0 1 0 0 0 0 0 2 0 0 0 0 2 0 0 2 0 4  0 0 0 0 0 0 0 8

    pep -> pep->p-ep->pe-p->one word possible
    similarly pepcoding-> pepcoding->p-epcoding->pe-pcoding->
    pep-coding->pepc-oding->pepco-ding->pepcod-ing->pepcodi-ng->pepcodin-g

    private static Set<String> dictionary = new HashSet<>();

    public static void main(String [] args) {

        //array of string to be added in dictionary set.
        String temp_dectionary[] = {"mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and",
                "go", "i", "like", "cream"};

        //loop to add all strin g in dictionary set
        for (String temp : temp_dectionary
        ) {
            //sample input case
            System.out.println(wBp("ilikesamsung"));
            System.out.println(wBp("iiiiiiii"));
            System.out.println(wBp(" "));
            System.out.println(wBp("ilikelikeimangoiii"));
            System.out.println(wBp("samsungandmango"));
            System.out.println(wBp("samsungandmangok"));
        }
        //returns true if the word can be segmented into parts such
        //that each part is contained in dictionary
    }
        public static  boolean  wBp(String  word){

        int size = word.length();
        //base case
            if (size==0)
                return true;

            //else check for all word
            for (int i =1;i<=size;i++){
                //now we will first divide the word into two parts
                //the prefix will have a length of i and check if it is
                //present in dictionary .if yes then we will check for
                //suffix of length size-i recursively .if both and prefix '
                //suffix are present the word is found in dictionary.
                if (dictionary.contains(word.substring(0,i))&& wBp(word.substring(i,size)))
                    return true;

            }
            //if all case is failed then
            return false;

    }
}


 */
// above is recursive approch

//dp approch
public class WordBreak {

    public static boolean wordBreeak(List<String> dict, String str, int[] lookup) {
        //n store the length of current sub string
        int n = str.length();
        //return true if end of string is reached
        if (n == 0) {
            return true;
        }
        //iif the subproblem is seen for the first time
        if (lookup[n] == -1) {

            //mark subproblem as seen (not segmented)
            for (int i = 1; i <= n; i++) {
                //consider all the prefix of the current string
                String prefix = str.substring(0, i);

                //if prefix is found
                if (dict.contains(prefix) && wordBreeak(dict, str.substring(i), lookup)) {

                    //return true if the string can be segmented
                    lookup[n] = 1;
                    return true;
                }

            }
        }
        //return solution to the current subproblem
        return lookup[n] == 1;
    }

    //list of string to represent a dictionary
    //we can also use a trie or set to store dictionary
    public static void main(String[] args) {


        List<String> dict = Arrays.asList("this", "th", "is", "famous", "Word", "Break", "b", "e", "a",
                "br", "bre", "brea", "ak", "Problem");
        //input string
        String str = "WordBreakProblem";
        //lookp array to store solution to subproblem
        int[] lookup = new int[str.length() + 1];
        Arrays.fill(lookup, -1);

        if (wordBreeak(dict,str,lookup)){
            System.out.println("the string can be segemented");
        }else{
            System.out.println("the string is not segmented");
        }
    }
}