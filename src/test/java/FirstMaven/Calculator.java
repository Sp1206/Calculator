package FirstMaven;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class Calculator {
	
     
	public static void main(String[] args) {

		String ff;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("plz enter first number");
			double a = sc.nextDouble();

			System.out.println("plz enter operation like * or + or - or /");

			String op = sc.next();

			System.out.println("plz enter second number");
			double b = sc.nextDouble();

			if (op.equals("+")) {
				sum(a, b);
			}

			else if (op.equals("-")) {
				sub(a, b);
			}

			else if (op.equals("*")) {
				multi(a, b);
			}

			else if (op.equals("/")) {
				div(a, b);
			}

			else {

				System.out.println("plz enter valid operation ");

			}

			System.out.println("do you want to calculate more enter yes or enter no to exit " );
			ff = sc.next();
			
			if(ff.equals("no")) {
				System.exit(0);
				
			}

		} while (ff.equals("yes"));

	}
   
	public static void sum(double a, double b) {
		double sum = a + b;
		System.out.println("sum is --> " + sum);

	}

	public static void sub(double a, double b) {
		double sub = a - b;
		System.out.println("subtraction is -->" + sub);
	}

	public static void multi(double a, double b) {
		double multi = a * b;
		System.out.println("multiplication is -->" + multi);
	}

	public static void div(double a, double b) {
		
		if(b==0) {
			System.out.println("can not divite by zero");
		}

		double div = a / b;
		System.out.println("Division is -->" + div);
	}

}
