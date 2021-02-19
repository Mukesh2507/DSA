package com.Array;

//merging intrval values (2,5) (4,10) (11,15) (12,14)
//first sort them these are already sorted
// ans will be (2,10) (11,15)


import java.util.*;

public class Interval {


    int start,end;
    Interval(int start,int end ){




        this.start=start;
        this.end=end;

    }






    public static  void mergeInterval(Interval [] arr){


        //test if given set has at leas one interval
        if (arr.length<=0){
            return;
        }

        // create empty stack

        Stack<Interval> stack = new Stack<>();
        // sort the intervals in ascending order

        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });


        // push the first interval onto the stack
        stack.push(arr[0]);

        //start from the next interval and merge if neccesary

        for (int i =0 ;i<arr.length;i++){




            //get interval from top stack
            Interval top = stack.peek();
            //if current interval is not overloping with stack top;
            //push it  to the stack
            if (top.end < arr[i].start) {

                stack.push(arr[i]);

            }

                //otherwise update the ending time of top if ending of current
                //interval is more
                else if (top.end <arr[i].end){


                    top.end = arr[i].end;
                    stack.pop();
                    stack.push(top);
                }
            }

            System.out.println("the merge intervals are: ");
            while(!stack.isEmpty()){

                Interval t = stack.pop();
                System.out.println("[" +t.start +","+t.end+"]");
            }
        }



    public static void main(String[] args) {
         Interval[] arr = new Interval[4];
         arr[0] = new Interval(6,8);
        arr[1] = new Interval(1,9);
        arr[2] = new Interval(2,4);
        arr[3] = new Interval(4,7);
        mergeInterval(arr);
    }



}
