package com.javaCollection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Constructor {

	public static void main(String[] args) {
		Set<Integer> firstFiveFibonacciNumber=new HashSet<>();

		//Default ArrayList constructor
		firstFiveFibonacciNumber.add(1);
		firstFiveFibonacciNumber.add(1);
		firstFiveFibonacciNumber.add(2);
		firstFiveFibonacciNumber.add(3);
		firstFiveFibonacciNumber.add(5);
		System.out.println("firstFiveFibonacciNumber is "+firstFiveFibonacciNumber+" HashSet doesn't allow duplicate, so only a '1' is printed");


		//parameterized ArrayList constructor (we can pass previously created collection object)
		//It will be the copy of the previously created collection.
		Set<Integer> firstTenFibonacciNumber=new HashSet<>(firstFiveFibonacciNumber);
		System.out.println("Before adding last five number-- firstTenFibonacciNumber is  "+firstTenFibonacciNumber);

		Set<Integer> nextFiveFibonacciNumber=new HashSet<>();
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
		Set<Integer> firstTwentyFibonacciNumber=new HashSet<>(); //initialCapacity or DEFAULT_CAPACITY=10;

		firstTwentyFibonacciNumber.addAll(firstTenFibonacciNumber);
		System.out.println("Before adding last ten number-- firstTwentyFibonacciNumber is  "+firstTwentyFibonacciNumber);

		firstTwentyFibonacciNumber.clear();
		System.out.println("After clearing-- firstTwentyFibonacciNumber is  "+firstTwentyFibonacciNumber);
		firstTenFibonacciNumber.remove(1);
		System.out.println("After removing '1', firstTenFibonacciNumber is "+firstTenFibonacciNumber);
		firstTenFibonacciNumber.removeAll(firstFiveFibonacciNumber);
		System.out.println("After removing 'firstFiveFibonacciNumber', firstTenFibonacciNumber is "+firstTenFibonacciNumber);
	}




}
