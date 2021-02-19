package com.arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int a[] ={5,1,6,2,4,3}; //index position 0 1 2 3 4 5
        int temp,j ;

        for(int i =1;i<a.length;i++){

            temp =a[i]; //storing temp for compare intially temp=1
            j=i; //j=1
                 // 1>0  $$  5>1 true
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];   //now by this five will come to the first postion
                 j=j-1;//decreament after one exectuion now j is decremented so j=0 new again going into while loop and check it
            }//so here j=0 condition false thats why now 0=1 sp in the o postion 1 will store we can say this is else loop
            a[j]=temp;
        }
        for (int
                item: a) {
            System.out.println(item);

        }

    }

}
