package com.comparator;






// comaparable explination and have method compareto and and also used in collection.sort
//comparator is also interface method used compare comparator we can used us per need and change
//while in comparable we need to change functionality
public class Students { // implements Comparable<Students>

    int marks;
    String name;

    public Students(int marks, String name) {

        super();
        this.marks = marks;
        this.name = name;


    }

    @Override
    public String toString() {

        return "Student[marks =" + marks + ", name =" +name +"]";

    }

    public int getMarks() {

        return marks;


    }

    public void setMarks() {


        this.marks = marks;
    }

    public String getName() {


        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    //@Override
    public int compareTo(Students obj) {

     //   if(this.marks>obj.marks) return -1;// for decreasing order -1,1,0 and for increasing order 1,-1,0

       // else if(this.marks< obj.marks) return 1; //current object is greater then return -1 and
                                                 // if small return 1 and for equals return 0
        //return 0;
         //return this.name.compareTo(obj.name);
//for comparator
        return this.marks - obj.marks;
    }



}
