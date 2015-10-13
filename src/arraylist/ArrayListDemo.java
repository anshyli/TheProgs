package arraylist;

import java.util.*; 
/*
 * The following code demonstrates using the ArrayList. It adds several items to the list, shows the list, removes some items and displays the list again. Or at least it should. This code doesn't work. It won't compile. Find the error and fix it:

import java.util.*; 
class ArrayListDemo { 
public static void main(String args[]) { 
// create an array list 
ArrayList al = new ArrayList(); 
System.out.println("Initial size of al: " + 
al.size()); 
// add elements to the array list 
al.add("C"); 
al.add("A"); 
al.add("E"); 
al.add("B"); 
al.add("D"); 
al.add("F"); 
al.add(1, "A2"); 
System.out.println("Size of al after additions: " + 
al.sizes()); 
// display the array list 
System.out.println("Contents of al: " + al); 
// Remove elements from the array list 
al.remove("F"); 
al.remove("G"); 
al.remove(2); 
System.out.println("Size of al after deletions: " + 
al.size()); 
System.out.println("Contents of al: " + al); 
} 
}
 */
class ArrayListDemo { 
    
public static void main(String args[]) { 
        // create an array list 
        ArrayList<String> al = new ArrayList<String>(); 
        System.out.println("Initial size of al: " + 
        al.size()); 
        // add elements to the array list 
        al.add("C"); 
        al.add("A"); 
        al.add("E"); 
        al.add("B"); 
        al.add("D"); 
        al.add("F"); 
        al.add(1, "A2"); 
        System.out.println("Size of al after additions: " + 
        al.size()); 
        // display the array list 
        System.out.println("Contents of al: " + al); 
        // Remove elements from the array list 
        al.remove("F");  
        al.remove(2); 
        System.out.println("Size of al after deletions: " + 
        al.size()); 
        System.out.println("Contents of al: " + al);
	}
}