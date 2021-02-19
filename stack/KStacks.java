package com.stack;

public class KStacks {
    // A java class to represent k stack in a single array of size n

   int arr[] ;//Array of size n to store actual content to be stored in stack
   int top[] ; //Array of size k to store index of top element of stacks
   int next [];// Array of size n to store next  entry in all stacks
    //and free list
int n , k;
int free;//to store beginning index of free list
//constructor
 KStacks(int k1, int n1){
         k=k1;
         n=n1;
         arr = new int [n];
         top= new int[k];
         next = new int [n];
         //intialize all stack as empty
    for (int i=0;i<k;i++)

        top[i] = -1;
        free = 0;//intialize all space as free

        for (int i = 0; i < n - 1; i++)

            next[i] = i + 1;
            next[n - 1] = -1;

    }
        // A utility function to check if there is space available
        boolean isFull(){
            return (free==-1);
        }

        //to push an item in stack number 'sn' where sn is from  0 to k-1
        void push(int item,int sn) {

            if (isFull()) {
                System.out.println("stack is overflow");
                return;
            }
            int i = free;//store index of free slot
            //ipdate index of free slot to index slot in  free list
            free = next[i];
            //update next of top and then top for stack number 'sn'
            next[i] = top[sn];
            top[sn] = i;

            //put the item in array
            arr[i] = item;
        }
        //to pop an from stack number 'sn' where sn is from 0 to k-1
    int pop(int sn) {

        //underflow check
        if (isEmpty(sn)) {
            System.out.println("stack underflow");
            return Integer.MAX_VALUE;
        }
        //find index of top item in stack number 'sn'
        int i = top[sn];
        top[sn] = next[i];//change top to store next of previous top

        //attach the previous top to beginning of free lis
        next[i] = free;
        free = i;
   return arr[i];
    }
    boolean isEmpty(int sn){
     return (top[sn]==-1);
}

    public static void main(String[] args) {
        int k=3,n=10;
        KStacks ks = new KStacks(k,n);
        ks.push(15,2);
        ks.push(42,2);
        ks.push(17,1);
        ks.push(39,1);
        System.out.println(ks.pop(2));
        System.out.println(ks.pop(1));
        System.out.println(ks.pop(0));
    }

}
