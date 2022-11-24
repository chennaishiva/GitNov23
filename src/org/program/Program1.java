package org.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program1 {
	
	public static void main(String[] args) {
		
		int[] x = {10, 20, 40};
		
		List li = new ArrayList();
		Collections.addAll(li, x);
		System.out.println(li);
		
		String[] c = {"siva", "navin"};
		
//		List list = Arrays.asList(c);
//		System.out.println(list);
		
		List<String> mi = new ArrayList();
		Collections.addAll(mi, c);
		System.out.println(mi);
	}

}
