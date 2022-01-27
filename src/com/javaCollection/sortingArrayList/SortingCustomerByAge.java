package com.javaCollection.sortingArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCustomerByAge {

	public static void main(String[] args) {
		List<Customer> c=new ArrayList<Customer>();
		c.add(new Customer(1,"Mukesh",30, 9000));
		c.add(new Customer(2,"Pavan",28, 5000));
		c.add(new Customer(3,"Mohammod",40, 7000));


		System.out.println("Unsorting :"+c);


		Collections.sort(c, new SortAge());
		System.out.println("After sorting by age :"+c);
	}
}


class SortAge implements Comparator<Customer>{

	@Override public int compare(Customer o1, Customer o2) {

		return (int) (o1.getAge() - o2.getAge()); } }





