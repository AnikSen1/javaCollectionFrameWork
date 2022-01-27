package com.javaCollection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Characteristic {
	
	public static void main(String[] args) {
		Set<String> itInstitute=new HashSet<>();
		
		
		//1.Doesn't allow duplicate value
		//2.Doesn't maintain the insertion order
		itInstitute.add("TEP");
		itInstitute.add("Anik IT solutions");
		itInstitute.add("Anik IT solutions");
		
		
		System.out.println(itInstitute);
		
		//3.allows null value
		itInstitute.add(null);
		System.out.println(itInstitute);
		
		//4. we can't create an arraylist of primitive types like int, char etc
		//we have to use boxed types like Integer, Character, Boolean etc.
				
		//5.Java HashSet is not thread-safe.

	}
	

}
