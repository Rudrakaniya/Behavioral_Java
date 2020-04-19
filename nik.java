/*
Write a program to create two array lists containing 
“apple”, “orange”, “grapes”, “banana”, “strawberry”, 
“avocados” and “apple”, “apricots”, “orange”, “banana”, “mango”, 
“lemon” respectively and find their union, difference, 
and intersection using appropriate methods of Array List class.
*/
import java.util.*;

class nikhil 
{ 
	public static void main(String args[]) 
	{ 
        ArrayList<String> aList1 =  new ArrayList<String>();new ArrayList<String>();
        ArrayList<String> aList2 = new ArrayList<String>(); 

        //adding the elements of Array List 1.
        aList1.add("apple");
        aList1.add("orange");
        aList1.add("grapes");
        aList1.add("banana");
        aList1.add("strawberry");
        aList1.add("avocados");

        //adding the elements of Array List 2.
        aList2.add("apple");
        aList2.add("apricots");
        aList2.add("orange");
        aList2.add("banana");
        aList2.add("mango");
        aList2.add("lemon");

        System.out.println("Elements of the first ArrayList are: -");
        System.out.println(aList1);
        System.out.println("");

        System.out.println("\nElements of the Second ArrayList are: -");
        System.out.println(aList2);
        System.out.println("");

        System.out.println("\n#1.");
        System.out.println("So Union of the above two ArrayLists is: -");
        ArrayList<String> tempList1 = new ArrayList<String>();
        for(String i : aList1){
            tempList1.add(i);
        }
        tempList1.addAll(aList2);
        System.out.println(tempList1);
        System.out.println();

        System.out.println("\n#2.");
        System.out.println("So Intersection of the above two ArrayLists is: -");
        ArrayList<String> tempList2 = new ArrayList<String>();
        for(String i : aList1){
            tempList2.add(i);
        }
        tempList2.retainAll(aList2);
        System.out.println(tempList2);
        System.out.println();


        System.out.println("\n#3.");
        System.out.println("So Difference of the above two ArrayLists is: -");
       
        ArrayList<String> tempList3 = new ArrayList<String>();
        for(String i : aList1){
            tempList3.add(i);
        }
        tempList3.removeAll(aList2);
        System.out.println(tempList3);
        System.out.println();



	} 
} 
