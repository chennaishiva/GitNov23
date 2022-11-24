package org.program;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {

		String x[] = new String[5];
		x[0] = "cos";
		x[1] = "sin";
		x[2] = "tan";
		x[3] = "sin";
		x[4] = "cos";

		// It will check all the possibilities

		for (int i = 0; i < x.length; i++) {

			for (int j = i + 1; j < x.length; j++) {

				if (x[i] == x[j]) {
					System.out.println(x[i]);
				}
			}

		}

	}

}
