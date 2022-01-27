package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DifferenceHashSetAndTreeSet {


		   public static void main(String args[]) {
			   
			   
		      int a[] = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
		      
		      Set<Integer> s = new HashSet<Integer>();
		      
		      try {
		         for(int i = 0; i < 5; i++) 
		              {
		            s.add(a[i]);
		               }
		         System.out.println(s);
		         
		         TreeSet sorted = new TreeSet<Integer>(s);
		         System.out.println("Sorted list = "+sorted);
		         
		           } 
		      catch(Exception e) {
		    	  System.out.println(e);
		      }
		   }

	}


