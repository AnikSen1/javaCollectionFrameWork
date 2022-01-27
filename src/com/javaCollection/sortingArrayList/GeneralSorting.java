package com.javaCollection.sortingArrayList;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

public class GeneralSorting {

	public static void main(String[] args) {
		// Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
  
        //sorting the elements of ArrayList in ascending order.
        Collections.sort(al);
        
        System.out.println("sorting the elements of ArrayList in ascending order : " + al);
        
     
        
        //sorting the elements of ArrayList in descending order.
      Collections.sort(al, Collections.reverseOrder());
  
        System.out.println("sorting the elements of ArrayList in descending order : " + al);

	}

}
