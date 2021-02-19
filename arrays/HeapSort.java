package com.arrays;

public class HeapSort {


    public static void main(String[] args) {

        int[] arr = {22, 13, 17, 11, 10, 14, 12};

        HeapSort hs = new HeapSort();//crating object to call method
        hs.sort(arr);
        hs.printArray(arr);
    }

    void sort(int[] arr) {
        int leng = arr.length; //finding length


        for (int i = leng / 2 - 1; i >= 0; i--)//leng 7(no of element in array) i=2(i=7/2- 1)
        {
            heapify(arr,leng,i);//heapfy used to compare elemt and replace the element for first it replace oindex postion element and last index postion 22->12 so now it dint considered 22
               // then create heap tre for ex 12-> 13,17 but 12 is smaller then 17 or 13 so replace 17->13,12 correct now next 11 is smaller so ok next10 is aslo smaller so ok
             // 14 is greater then 13 and 12 so replace it so now 12 child is 11,10 and 13 child is 14 so now 14 child is->13 so new list 17 12 14 11 10 13
            //now again 17 replaced with last 13 and 17 is at thir postion so no required count hence new list is 13 12 14 11 10
            //now again 13->12,14 but 14 is greter so replace hence 14->13,12 and finally sorting is done  14 13 12 11 10 repeat it until creation of heap
        }

        for (int i=leng-1;i>=0;i--){
            //swap the elemnt and heapify again leng-1 becuse dont considered last element
            //swaping first and last index postion
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
        heapify(arr,i,0);
        }
    }
    void heapify(int[] arr,int n,int i){//n=length
    //first we find the postion of left child and right child postion and parent
        int largest=i; //parent node
        int li=2*i+1;//left child index postion
        int ri =2*i+2;//right child index postion

        if (li<n && arr[li]>arr[largest]){//if parent node is smaller then left child then
            largest=li;
    }
        if(ri<n && arr[ri]>arr[largest]){

            largest= ri;

        }
        if (largest!=i){

            int temp =arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);


        }
}
void printArray(int[] arr){
      for (int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }
    }
}