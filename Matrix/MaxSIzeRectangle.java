package com.Matrix;
//maximum size rectangle

import java.util.Stack;

public class MaxSIzeRectangle {

    static int maxHist(int R ,int C,int row[]) {

        //create an empty stack the stack holds index of
        //hist[] array/ the bars stored in stack are always
        //in increasing order of their heights
        Stack<Integer> result = new Stack<Integer>();
        int top_Val; //top of stack

        int max_area = 0; //intial max area in current row or histogram

        int area = 0; //intial area with current top

        //run through all bars of given histogram
        int i = 0;
        while (i < C) {
            //if this bar is higher than the bar on top
            //stack push performed

            if (result.empty() || row[result.peek()] <= row[i])
                result.push(i++);

            else {

                //if this bar is lower than top of stack
                //then calculate area of rectangle with
                //stack top as the smallest bar
                //i right index for the
                //top and element before top in stack is
                //left index

                top_Val = row[result.peek()];
                result.pop();
                area = top_Val * i;


                if (!result.empty())

                    area = top_Val * (i - result.peek() - 1);
                max_area = Math.max(area, max_area);
            }
        }



            //now pop the remaining bars from stack and
            //calculate area with every popped bar as the
            //smallest bar
            while (!result.empty()) {


                top_Val = row[result.peek()];
                result.pop();
                area = top_Val * i;
                if (!result.empty())
                    area = top_Val * (i - result.peek() - 1);
                max_area = Math.max(area, max_area);


        }
            return max_area;
        }
        //returns area of the largest rectangle with all 1s in
        //A[][]
        static int maxRectangle ( int R, int C, int A[][]){


            //calculate area for first row and initalize it as
            //result
            int result = maxHist(R, C, A[0]);
            //iterate over row to find maximum rectangular area
            //considering each row as histogram

            for (int i = 1; i < R; i++) {


                for (int j = 0; j < C; j++)

                    if (A[i][j] == 1)
                        A[i][j] += A[i - 1][j];

                    result = Math.max(result, maxHist(R, C, A[i]));
                }
                return result;
            }

    public static void main(String[] args) {
        int R =4;
        int C = 4;
        int A[][] = {{0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,0,0}
        };
        System.out.println(+maxRectangle(R,C,A));
    }
    }