package com.generic;




//no need to make multiple array we can define one generic method for multiple arrays like customer account etc or different data type
//or same name of function or same arguments only type is change we will apply generic methods
public class CustomGenerics {


    //public  void printArray(String[] s) {

        //for (int i = 0; i < s.length; i++) {

        //    System.out.println(s[i]);

      //  }

    //}
        //we can use method overloding concept of polymorphism do print arrays of same name function for limited time
     //public  void printArray(Integer[] n) {

       //  for (int i = 0; i < n.length; i++) {

         //    System.out.println(n[i]);
         //}


     //}

    //generic method
  //  here E will automatically convert into array

    //imp line E only can reference  type like Integer not int or primitive type
    public  <E> void printArray(E []s){
   // foreach(E x : s) -> pass into sout
        for (int i =0 ;i<s.length;i++){

            System.out.println(s[i]);
        }

    }


    public static void main(String[] args) {
        CustomGenerics cg = new CustomGenerics();
        String countries[] = new String[] {"india","pakistan"};
        Integer  numbers[] ={1,3,4};
        cg.printArray(countries);
        cg.printArray(numbers);
    }
}
