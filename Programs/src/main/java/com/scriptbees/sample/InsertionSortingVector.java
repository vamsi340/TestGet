package com.scriptbees.sample;

import java.util.Collections;
import java.util.Vector;

public class InsertionSortingVector {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();

		vector.add("vamsi");
		vector.add("Anna");
		vector.add("sai");
		vector.add("scriptbees");
		vector.add("java");
		vector.add("project");

		System.out.println("Vector elements before sorting: ");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		Collections.sort(vector);

		System.out.println("Vector elements after sorting: :");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
	}
}