package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicate {


    public static void main(String[] args) {
        String str = "krishnasakila";

        char[] chars = str.toCharArray();// k r i s h n a s h a k i l a
        Map<Character,Integer> charMap = new HashMap<>();
        //logic-->character are inserted as key and the repective count inserted as value
        //if map already contains the character then increses the value by 1;
        //(k,1)
        for (Character ch: chars
             ) {
            if (charMap.containsKey(ch)){

                charMap.put(ch,charMap.get(ch)+1);//(k,1)->(k,2)
            }else{
                charMap.put(ch,1);//if not repeating then
            }
        }
        //loop through only keys

        Set<Character> keys = charMap.keySet();//because set contain uniq keys
        for (Character ch:keys) {
         if (charMap.get(ch) > 1)//first get k and gives 2{

             System.out.println("Character :" +ch  +" repeating  :" + charMap.get(ch) + " times");
        }


    }
}
