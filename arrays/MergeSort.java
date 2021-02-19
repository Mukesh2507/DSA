package com.arrays;

public class MergeSort {

     int[] array;  //instance variable declare
     int[] tempMergeArr;
     int length;


    public static void main(String[] args) {

         int[] inputArr = {48,36,13,52,19,94,21};
         MergeSort ms=new MergeSort();
         ms.sort(inputArr);

        for (int i: inputArr)
              {
                  System.out.println(i);
        }
    }

    public void sort(int inputArr[]){
       this.array=inputArr;//declring instane variable
      this.length = inputArr.length;
      this.tempMergeArr=new int[length];
       divideArray(0,length-1);
    }


    public void divideArray(int lowerIndex,int higherIndex){

        //recursive method

        if (lowerIndex<higherIndex){
            int middle = lowerIndex+(higherIndex-lowerIndex)/2;
            divideArray(lowerIndex,middle);//it will sort the left side array
            divideArray(middle+1,higherIndex);//it will sort right sub tree

            mergeArray(lowerIndex,middle,higherIndex);



        }




    }
    public void mergeArray(int lowerIndex,int middle,int higherIndex){

        for (int i=lowerIndex;i<=higherIndex;i++){

            tempMergeArr[i]=array[i];
        }
        int i=lowerIndex; // here we are using this to comapare the element of two divided array  and and adding to one array
        int j=middle+1;
        int k=lowerIndex;
        while(i<=middle && j<=higherIndex){

            if(tempMergeArr[i]<=tempMergeArr[j]){

                array[k]=tempMergeArr[i];
                i++;
            }
            else{

                array[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }

        while(i<=middle){

            array[k]=tempMergeArr[i];
            k++;
            i++;
        }





    }




}


