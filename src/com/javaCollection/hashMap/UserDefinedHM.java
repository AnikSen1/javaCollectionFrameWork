package com.javaCollection.hashMap;

import java.util.HashMap;
import java.util.Map;

public class UserDefinedHM {

	public static void main(String[] args) {
		
 Map<Integer,Student> studentMapping=new HashMap<Integer,Student>();
 studentMapping.put(1, new Student("Pavan", "Kumer"));
 studentMapping.put(2, new Student("Sonjoy", "Kumer"));
 studentMapping.put(3, new Student("Mukesh", "Mondol"));
 System.out.println(studentMapping);
 System.out.println(" ");
 System.out.println(studentMapping.keySet());
 System.out.println(" ");
 System.out.println(studentMapping.values());
	}

}
