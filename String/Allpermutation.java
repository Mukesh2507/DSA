package com.String;
//print all the permutation of the given string

/*
  for example given string is ABC
             ABC
             /\  \ swap a with a-a a-b a-c now intial element are fixed  remain two
           abc bac cba    swap b with b  b-c a-c b-b b-a
           /\    /\      /\  as two postion are fixed and remain one character no swap occurs
         abc acb bac bca cba cab
         bactracking approch is used
         time compelxity is (n*N|)
 */
public class Allpermutation {


    public static void main(String[] args){

        String str ="ABC";
        int n = str.length();
        Allpermutation permutation = new Allpermutation();
       Allpermutation.permute(str,0,n-1);


    }
    // r ending index
    // l start index

    private  static void permute(String str,int l,int r){
        if (l==r){ //it means if only one chara ter in string then no need do anything
            System.out.println(str);

        }
        else{


            for (int i=l;i<=r;i++){ //for checking all permutation ABC intial l=0 r=2
                 //second step i incremented
                str=swap(str,l,i); //swap with a-a nothing will happen ABC  // bca
                permute(str,l+1,r);// finding permutation  //bca
                str=swap(str,l,i);   // now here r = l and then we print abc first permutation is printed
            }
        }

    }

    public static  String swap(String a,int i,int j){

        char temp;
        char[] chraArray = a.toCharArray();
        temp = chraArray[i];
        chraArray[i] =chraArray[j];
        chraArray[j] =temp;
        return String.valueOf(chraArray);


    }



}
