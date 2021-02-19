package com.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//find duplicate in array of  N +1  integer
public class Duplicate {


    public static void main(String[] args) {


        int[] a = {1, 2, 3, 2, 3, 4, 4,4,3};
        System.out.println("duplicates are : ");

        Map<Integer, Integer> hm = new HashMap<>();
        for (int no : a
        ) {
            Integer count = hm.get(no);
            if (count == null) {

                hm.put(no, 1);
            } else {
                count = count + 1;
                hm.put(no, count);
            }
        }


        Set<Map.Entry<Integer, Integer>> es = hm.entrySet();//entry set is submap and we used this when we need to get from Map
        for (Map.Entry<Integer, Integer> me : es
        ) {
            if (me.getValue() > 1) {
                System.out.println(me.getKey() + " ");
            }
        }
    }
}










        //set interface
        /**
         * a{3,5,43,2,2,1}
         * reffrence-> set<Integer> s = new Hashset<>();
         * all element add into set
         * for(int no:a)
         * if(s.add(no)==false) here set doesnt allowed to add duplicate value so if s.add is not allowed then;
         *  sout(no);
         *  if element is more then two time then it writen it again faster then brute force
         */






        // brute force logic part


        /**
         *  a{3,5,4,3,2,2,1}
         *  take one element and compare with all other element in array then again next and compare
         *  for(int i =0;i<n;i++) ->for index postion
         *  for(j=i+1;j<n;j++) this for loop traverse on element ahead and compare it with first index position
         *    if(a[i]==a[j] && (i!=j))
         *    sout (a[j] +"");
         *    this method is not applicable for more then two duplicate element
         */


//Hash table

/**
 * a[3,5,4,3,2,2,1]
 * Map<Integer,integer> hm = new HashMap<>()
 * forEach(int no :a)
 * Integer count= hm.get(no); -> gives output in the form of integer intial null
 * if(Count ==null)
 * hm.put(no,1)
 *
 * else
 * if value is already presebnt
 *  count = count+1
 *  hm.put(no,count);
 * set<Map.Entry<Integer,integer>> es =hm.entrySet();
 * foreachMap.Entry<Integer,Integer> no :es)
 * if(me.getValue()>2)
 * sout  me.getKey()
 *
 */




