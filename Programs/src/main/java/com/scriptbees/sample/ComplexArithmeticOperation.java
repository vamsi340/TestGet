package com.scriptbees.sample;

public class ComplexArithmeticOperation {
	double real, img;

	ComplexArithmeticOperation(double r, double i) {
		this.real = r;
		this.img = i;
	}

	public static ComplexArithmeticOperation sum(ComplexArithmeticOperation c1, ComplexArithmeticOperation c2) {
		ComplexArithmeticOperation temp = new ComplexArithmeticOperation(0, 0);

		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;

		return temp;
	}

	public static void main(String args[]) {
		ComplexArithmeticOperation c1 = new ComplexArithmeticOperation(5.5, 4);
		ComplexArithmeticOperation c2 = new ComplexArithmeticOperation(1.2, 3.5);
		ComplexArithmeticOperation temp = sum(c1, c2);
		System.out.printf("Sum is: " + temp.real + " + " + temp.img + "i");
	}
}