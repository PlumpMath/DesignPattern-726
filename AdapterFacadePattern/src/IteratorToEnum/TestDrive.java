package IteratorToEnum;

import java.util.ArrayList;
import java.util.Enumeration;

public class TestDrive {

	public static void main(String[] args) {		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		 
		Enumeration<String> s = new IteratorAdaptor(arr.iterator());
		
		while (s.hasMoreElements()) {
			String string = (String) s.nextElement();
			System.out.println("TestDrive.main()" + string);			
		}
		
		
	}

}
