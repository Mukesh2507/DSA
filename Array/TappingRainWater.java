package com.Array;

//import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class TappingRainWater {

    public static void main(String[] args) {


        int [] a ={3,0,1,2,5};

        int n = a.length;

        System.out.println(trappingwater(a,n));
    }

  //  private static int trappingwater(int[] a, int n) {



    //    int water =0;


      //  for (int i =1;i<n-1;i++){


        //    int lmax =a[i];

          //  for (int j =0;j<i;j++){

            //    lmax= Math.max(lmax,a[j]);
            //}
            //int rmax = a[i];
            //for (int j =i+1;j<n;j++){

              //  rmax=Math.max(rmax,a[j]);

            //}

            //water = water+(Math.min(lmax,rmax)-a[i]);
       // }

        //return water;

    //}


//}
  public static int  trappingwater(int [] a,int n){

        int [] left =  new int[n];
        int [] right = new int[n];

        left[0]=a[0];
        right[n-1]=a[n-1];


        for (int i = 1 ;i<n ;i++){


            left[i]=Math.max(left[i-1],a[i]);

        }
        for (int i = n-2; i>=0;i--){

            right[i]=Math.max(right[i+1],a[i]);


        }

        int ans =0;
        for (int i =0;i<n;i++){


            ans = ans+ (Math.min(left[i],right[i]))-a[i];
        }



return  ans;
    }
}