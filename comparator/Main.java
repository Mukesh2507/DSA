package com.comparator;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//comparator are used to compare real world objects not int or flots //sort
public class Main {


    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();

        students.add(new Students(23,"ram"));
        students.add(new Students(35,"Shyam"));
        students.add(new Students(13,"aman"));
        students.add(new Students(13,"rohit"));
        students.add(new Students(65,"Anu"));
       // Collections.sort(students);
        Collections.sort(students,new SortByNameTheMarks());
        students.forEach(System.out::println);
    }
}


class  SortByNameTheMarks implements Comparator<Students>{


    @Override
    public int compare(Students o1,Students o2){

        if (o1.name.equals(o2.name)){
            return o1.marks -o2.marks;
        }
        else{
            return o1.name.compareTo(o2.name);
        }
    }
}