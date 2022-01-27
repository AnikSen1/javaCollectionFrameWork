package com.javaCollection.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Characteristic {

	public static void main(String[] args) {
		Map<Integer, String> numberMapping=new HashMap<>();
		
		//1.Doesn't allow duplicate key, but allows duplicate value.
        //2.Doesn't maintain the insertion order
		numberMapping.put(2, "two");
		numberMapping.put(1, "five"); 
		numberMapping.put(1, "one");  //from duplicate key, only last duplicate key will print with its value
		numberMapping.put(3, "three");
		numberMapping.put(333, "three"); //allows duplicate value.
		
		//3.allows null key and value
		numberMapping.put(null, null);

		System.out.println(numberMapping);
		
		System.out.println("                                                     ");
		
		//get(3)
		System.out.println(numberMapping.getClass());       //will get the class name: java.util.HashMap.
		System.out.println(numberMapping.get(2));          //we can get the value using get(key)
		//System.out.println(numberMapping.get("two")); //But we can't get the key by using get(value)
		System.out.println(numberMapping.getOrDefault(numberMapping, "Rony"));//not clear 
		
		//4.HashMap is not thread-safe.
		
		System.out.println("                                                  ");
		
		//contains(2)
		System.out.println(numberMapping.containsKey(333));
		System.out.println(numberMapping.containsValue("three"));
		System.out.println(numberMapping.containsValue("four"));
		
		System.out.println("                                 ");
		
		//remove(2)
		System.out.println(numberMapping.remove(2));//remove and Return value 
		System.out.println(numberMapping);
		System.out.println(numberMapping.remove(3, 333));//remove and Return boolean data
		System.out.println(numberMapping);
		System.out.println(numberMapping.remove(3, "three"));//remove and Return boolean data
		System.out.println(numberMapping);
		
		
		System.out.println("              ");
		
		
		//replace(3)
		//System.out.println(numberMapping.replace(null, null);
		
		System.out.println(numberMapping.keySet());//return all the keys
		System.out.println(numberMapping.values());//return all the values
		
		System.out.println("             ");
		
		//iterate HashMap using java 8 forEach
		numberMapping.forEach((K,V)->{
			System.out.println("K="+K);
			System.out.println("V="+V);
		});
		
	}

}
