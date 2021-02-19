package com.String;
// we are going used hash function here because hash function is function which stroe key value pair
//suppose u have one object and u want to assign key for simple searching
public class RobinKarp {

    // d is the  the number of charcter in the inpu alphabet


    public final static int d =256 ;

    /*
    pat-> pattern
    txt->text
    q-> A prime number

     */
    static  void search(String pat,String txt,int q){

        int M = pat.length();
        int N = txt.length();
        int i,j;
        int p = 0; //hash value for pattern
        int t = 0 ;//hash value for text
        int h =1;
        //the value  of h would  be *pow (d, M-1)%q"

        for (i =0 ;i< M-1;i++)
            h = (h*d)%q;
        //calculate the hash value of patern and first
        //window of text

        for (i=0;i<M;i++)
        {

            p =(d*p + pat.charAt(i))%q;
            t =(d*t +txt.charAt(i))%q;
        }

        //slide the pattern over text one by one
        for (i=0;i<=N-M;i++)
        {

            //check the hash values of current window of text
            // and pattern if the hash values match then only
            //chechk for the chaaracter on by one
            if (p==t){

                /* check for charcater one bye one */
                for (j=0;j<M;j++){

                    if (txt.charAt(i+j) !=pat.charAt(j))
                        break;
                }
                if (j==M)
                    System.out.println("Pattern found at index" +i);
            }
            //calculate hash value for next windo of text :remove
            //leading digit add trailing digit
            if (i<N-M)
            {

                t = (d*(t-txt.charAt(i)*h)+ txt.charAt(i+M))%q;
                //we might get negative value of t converting it
                //to positive
                if (t<0)
                    t=(t+q);
            }
        }
    }

    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat ="GEEKS";
        int q = 101;
        //function call
        search(pat,txt,q);
    }
}































