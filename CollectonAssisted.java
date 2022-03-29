package practiceproject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.*;

public class CollectonAssisted {
public static void main(String[] args) {
	System.out.println("Array List");
	ArrayList<String> city=new ArrayList<String>();
	city.add("Bangalore");
	city.add("Delhi");
	System.out.println(city);
	System.out.println("\n");
	
	//creating vector
	System.out.println("Vector");
	Vector<Integer> vec=new Vector();
	vec.addElement(15);
	vec.addElement(30);
	System.out.println(vec);
	
	//creating linkedlist
	System.out.println("\n");
	System.out.println("Linked List");
	LinkedList<String> names=new LinkedList<String>();
	names.add("alex");
	names.add("john");
	Iterator<String> itr=names.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	
	//creating hashset
	System.out.println("\n");
	System.out.println("HashSet");
	HashSet<Integer> set=new HashSet<Integer>();
	set.add(101);
	set.add(103);
	set.add(102);
	set.add(104);
	System.out.println(set);
	
	//creating LinkedHashset
	System.out.println("\n");
	System.out.println("linkedHashSet");
	LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
	set2.add(11);
	set2.add(13);
	set2.add(12);
	set2.add(14);
	System.out.println(set2);
	}
}
}
