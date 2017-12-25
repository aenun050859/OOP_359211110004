package ooplab5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class myarrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        //add method
        myList.add("AE");
        System.out.println(myList);
        myList.add("KHWAN");
        myList.add("PLOY");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(2,"Hello");
        System.out.println(myList);
        myList.add(1,100);
        System.out.println(myList);
        myList.set(0,"Kanyarat");
        System.out.println(myList);
        myList.remove("Hello");
        System.out.println(myList);
        System.out.println(myList.indexOf(100));

    }//main

}//class
