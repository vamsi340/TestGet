package com.scriptbees.sample;

import java.util.Scanner;
import java.util.Vector;

public class BubbleSortVector {
	public static void main(String[] args) {
		int n, c, d, swap;
		Scanner s = new Scanner(System.in);

		System.out.println("Input number of integers to sort");
		n = s.nextInt();

		Vector<Integer> v = new Vector<Integer>();

		System.out.println("Enter " + n + " integers");

		for (c = 0; c < n; c++)
			v.insertElementAt(s.nextInt(), c);

		for (c = 0; c < (n - 1); c++) {
			for (d = 0; d < n - c - 1; d++) {
				if ((Integer) v.elementAt(d) > (Integer) v.elementAt(d + 1))

				{
					swap = (Integer) v.elementAt(d);
					v.insertElementAt(d + 1, d);
					v.insertElementAt(swap, d + 1);

				}
			}
		}

		System.out.println("Sorted list of numbers");

		for (c = 0; c < n; c++)
			System.out.println(v.elementAt(c));
	}

}
