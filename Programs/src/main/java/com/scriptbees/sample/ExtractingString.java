package com.scriptbees.sample;

public class ExtractingString {
	public static void main(String args[]) {
		String s1 = "IndianOcean";

		String s2 = s1;
		System.out.println(s2);

		String s3 = s1.substring(6);
		System.out.println(s3);

		String s4 = s1.substring(2, 8);
		System.out.println(s4);

		String names[] = { "www.yahoo.com", "www.gmail.com", "www.rediff.com", "www.arkut.com" };
		System.out.println("\nFollowing are the Web server names");

		for (int i = 0; i < names.length; i++) {
			int a = names[i].indexOf('.');
			int b = names[i].lastIndexOf('.');
			String str = names[i].substring(a + 1, b);
			System.out.print(str + "\t");
		}
	}
}
