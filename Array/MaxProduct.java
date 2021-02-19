package com.Array;

public class MaxProduct {

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

             maxProduct(nums);

        System.out.println("max sub product is " + maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int maxProduct = nums[0];
        int max = nums[0];
        int min = nums[0];


        for (int i = 1; i < nums.length; i++) {


            if (nums[i] < 0) {

                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);

            maxProduct = Math.max(maxProduct, max);
        }

       return maxProduct;
    }
}
// 2 3 -2 4
/* maxp =2
max =2
min =2
max =(2*3,3)=>6
min =(2*3,3)=>3
maxp =max(2,6)=>6


max =3;
min =6
max =max(3*-2,-2)=>-2
min =min(6*-2,-2)=>-12
maxp=maxp(6,-2)=>6

  max =max(-2*4,4)=>4
 */