package com.scriptbees.sample;

public class Exponential {
	public static void main(String args[]) {
		double x = 3;

		double result = Math.exp(x);
		System.out.println(result);

		double positiveInfinity = Double.POSITIVE_INFINITY;
		double negativeInfinity = Double.NEGATIVE_INFINITY;
		double nan = Double.NaN;

		result = Math.exp(nan);
		System.out.println(result);

		result = Math.exp(positiveInfinity);
		System.out.println(result);

		result = Math.exp(negativeInfinity);
		System.out.println(result);
	}

}
