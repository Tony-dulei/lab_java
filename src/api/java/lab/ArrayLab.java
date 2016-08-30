package lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayLab {

// In an array 1-100 numbers are stored, one number is missing how do you find it? 
// In an array 1-100 exactly one number is duplicate how do you find it?
// In an array 1-100 multiple numbers are duplicates, how do you find it?
// Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
// How do you find second highest number in an integer array?
// How to find all pairs in array of integers whose sum is equal to given number?
// How to remove duplicate elements from array in Java?
// How to find largest and smallest number in array? 
// How to find top two maximum numbers in array? 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Array Example
        String[] arrayobj = new String[3];
        arrayobj[0]= "Love yourself";
        arrayobj[1]= "Alive is awesome";
        arrayobj[2]= "Be in Present";
        System.out.println("====== Array object output : ======");
        for(int i=0; i < arrayobj.length ;i++) {
            System.out.println(arrayobj[i] + " ");
        }

        // ArrayList Example
        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("Alive is awesome");
        arrlistobj.add("Love yourself");
        System.out.println("Arraylist size is : " + arrlistobj.size());

        Iterator<String> it = arrlistobj.iterator();
        System.out.println("====== ArrayList object output : ======");
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        //LinkedList Example
        LinkedList<String> linklistobj = new LinkedList<String>();
        linklistobj.add("Tony is awesome");
        linklistobj.add("Tony loves me");
        System.out.println("LinkedList size is : " + linklistobj.size());

        Iterator<String> itlinkedlist = linklistobj.iterator();
        System.out.println("====== LinkedList object output : ======");
        while(itlinkedlist.hasNext()) {
            System.out.println(itlinkedlist.next() + " ");
        }
	}

}
