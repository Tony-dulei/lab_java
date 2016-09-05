package lab;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListLab {

//    Collection
//
//    The root interface in the collection hierarchy. A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. Some are ordered and others unordered.
//
//    http://download.oracle.com/javase/6/docs/api/java/util/Collection.html
//
//    List
//
//    An ordered collection (also known as a sequence). The user of this interface has precise control over where in the list each element is inserted. The user can access elements by their integer index (position in the list), and search for elements in the list.
//
//    http://download.oracle.com/javase/6/docs/api/java/util/List.html
//
//    Set
//
//    A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element. As implied by its name, this interface models the mathematical set abstraction.
//
//    http://download.oracle.com/javase/6/docs/api/java/util/Set.html
//
//    Map
//
//    An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
//
//    http://download.oracle.com/javase/6/docs/api/java/util/Map.html
    public static void main(String[] args) {
        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("1. Alive is awesome");
        arrlistobj.add("2. Love yourself");
        System.out.println("ArrayList object output :"+ arrlistobj);

        LinkedList llobj = new LinkedList();
        llobj.add("1. Alive is  awesome");  
        llobj.add("2. Love yourself"); 
        System.out.println("LinkedList object output :"+llobj);   
    }

}
