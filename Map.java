package practiceproject;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.*;
public class Map {
public static void main(String[] args) {
	//map
	//Hash map
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1,"Tim");
	hm.put(2,"Mary");
	hm.put(3,"Catie");
	System.out.println("\n the elements of HashMap are");
	for(Map.Entry m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	//HashTable
	Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	ht.put(4,"Ales");
	ht.put(5,"Rosy");
	ht.put(6,"jack");
	System.out.println("\n the elements of Hashtable are");
	for(Map.Entry n:ht.entrySet()) {
		System.out.println(n.getKey()+" "+n.getValue());
	}
	//TreeMap
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	map.put(8,"Annie");
	map.put(9,"Carlotte");
	map.put(10,"Catie");
	System.out.println("\n the elements of treemap are");
	for(Map.Entry i:map.entrySet()) {
		System.out.println(i.getKey()+" "+i.getValue());
	}
	
}
}
