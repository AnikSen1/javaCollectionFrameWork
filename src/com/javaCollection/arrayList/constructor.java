package com.javaCollection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class constructor {
	public static void main(String[] args) {
		//Default ArrayList constructor
	List<Integer> firstFiveFibonacciNumber=new ArrayList<>();
	firstFiveFibonacciNumber.add(1);
	firstFiveFibonacciNumber.add(1);
	firstFiveFibonacciNumber.add(2);
	firstFiveFibonacciNumber.add(3);
	firstFiveFibonacciNumber.add(5);
	System.out.println("firstFiveFibonacciNumber is "+firstFiveFibonacciNumber);
	
	
	//parameterized ArrayList constructor (we can pass previously created collection object)
	//It will be the copy of the previously created collection.
	List<Integer> firstTenFibonacciNumber=new ArrayList<>(firstFiveFibonacciNumber);
	System.out.println("Before adding last five number-- firstTenFibonacciNumber is  "+firstTenFibonacciNumber);

	List<Integer> nextFiveFibonacciNumber=new ArrayList<>();
	nextFiveFibonacciNumber.add(8);
	nextFiveFibonacciNumber.add(13);
	nextFiveFibonacciNumber.add(21);
	nextFiveFibonacciNumber.add(34);
	nextFiveFibonacciNumber.add(55);
	System.out.println("nextFiveFibonacciNumber is "+nextFiveFibonacciNumber);
	
	
	//Adding all the elements of a previously created collection into another previously created collection.
	firstTenFibonacciNumber.addAll(nextFiveFibonacciNumber);
	System.out.println("firstTenFibonacciNumber is "+firstTenFibonacciNumber);
	
	
	//parameterized ArrayList constructor (we can pass expected size to the ArrayList)
	List<Integer> firstTwentyFibonacciNumber=new ArrayList<>(20); //initialCapacity or DEFAULT_CAPACITY=10;
	
	firstTwentyFibonacciNumber.addAll(firstTenFibonacciNumber);
	System.out.println("Before adding last ten number-- firstTwentyFibonacciNumber is  "+firstTwentyFibonacciNumber);
	
	firstTenFibonacciNumber.remove(1);
	System.out.println("After removing '1', firstTenFibonacciNumber is "+firstTenFibonacciNumber+" From the two '1' ONLY a '1' will be removed");
	firstTenFibonacciNumber.removeAll(firstFiveFibonacciNumber);
	System.out.println("After removing 'firstFiveFibonacciNumber', firstTenFibonacciNumber is "+firstTenFibonacciNumber);

	
	firstTwentyFibonacciNumber.clear();
	System.out.println("After clearing-- firstTwentyFibonacciNumber is  "+firstTwentyFibonacciNumber);
	}
	
	
}
