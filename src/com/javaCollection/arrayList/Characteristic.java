package com.javaCollection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Characteristic {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		//1.List allows to add duplicate elements.
		list.add("apple");
		list.add("apple");
		System.out.println(list);
		
		//2.List allows to add null elements.
		list.add(null);
		System.out.println(list);
		
		//3.List maintains the insertion order
		list.add("element1");
		list.add("element3");
		list.add("element2");
		list.add("element4");
		System.out.println(list);
		//4.we can get access on the elements from list using indexes.
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
		//System.out.println(list.get(8)); if we execute this line, we will get indexOutOfBoundException.
		
		//5. we can't create an arraylist of primitive types like int, char etc
		//we have to use boxed types like Integer, Character, Boolean etc.
		
		//6.Java arrylist is not synchronized.
	}
	
}
