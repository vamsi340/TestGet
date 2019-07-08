package com.scriptbees.sample;

import java.util.Collections;
import java.util.Vector;

public class BinarySearchVector {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();

		vector.add("Apple");
		vector.add("Boll");
		vector.add("Dog");
		vector.add("Elephant");
		vector.add("Fox");

		Collections.sort(vector);
		System.out.println("Sorted Vector contains : " + vector);

		int index = Collections.binarySearch(vector, "Dog");

		System.out.println("Element found at : " + index);
	}
}
