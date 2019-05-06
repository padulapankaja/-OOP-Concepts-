package collectionNuwanKodagoda;

import java.util.*;
import java.util.ArrayList;

 public class Main {
	 public static void main(String args[]) {
		 
		 ArrayList<Integer> mylist = new ArrayList<Integer>();
		 
		 mylist.add(10);
		 mylist.add(30);
		 mylist.add(20);
		 mylist.add(40);
		// mylist.add("SLIIT");
		System.out.println(); 
		int total = 0;
		
		
		for(Integer val: mylist) {
			//System.out.println(val);
			//Integer num  = (Integer) val;
			total = total +  val ;
		}
		 System.out.println(total);
	 }
	
	
}
