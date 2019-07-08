package com.scriptbees.sample;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How Many Rows You Want In Your Pyramid?");
		int row = s.nextInt();
		int rowCount = 1;
		System.out.println("Here Is Your Pyramid");
		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(rowCount + " ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
