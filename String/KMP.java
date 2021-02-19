package com.String;

public class KMP {

    void KMPsearch(String pat,String txt) {

        int M = pat.length();
        int N = txt.length();
        //create lps[] that will hold the longest
        //prefix suffix value for pattern
        int lps[] = new int[M];
        int j = 0; //index for pat[]

        //preprocess the pattern (calculate lps[] array)
        computeLPSArray(pat, M, lps);

        int i = 0; //index for txt

        while (i < N) {

            if (pat.charAt(j) == txt.charAt(i))
                j++;
                i++;

            if (j == M){
                System.out.println("found pattern " + "at index " + (i - j));
            j = lps[j - 1];
        }

        //mismatch after j matches

        else if (i < N && pat.charAt(j) != txt.charAt(i)) {

            //do not match lps character
            //they will match anyway
            if (j != 0)
                j = lps[j - 1];
            else
                i=i + 1;
        }

    }

    }
    void computeLPSArray(String pat,int M,int lps[]) {


        //length of the previous longest prefix and suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; //lps is always 0
        //the loop calculates lps[i] for i= 1 to M-1
        while (i < M) {

            if (pat.charAt(i) == pat.charAt(len)) {

                len++;
                lps[i] = len;
                i++;
            } else // pat!=pat[len]
            {


                if (len != 0) {


                    len = lps[len - 1];
                } else //if len ==0
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat ="ABABCABAB";
        new KMP().KMPsearch(pat,txt);
    }




}
