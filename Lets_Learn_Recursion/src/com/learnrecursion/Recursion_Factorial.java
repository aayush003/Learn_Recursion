package com.learnrecursion;

import java.util.Scanner;

public class Recursion_Factorial {

	public static int factorial(int n) {

		int fact = 1;
		int num = n-1;

		if(num>0) 
		{
			System.out.print(n+" * ");
			if(num == 1)
				System.out.print(num);

			fact = n * factorial(num);
			return fact;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int input = 0;
		System.out.println("Enter a number for factorial : ");
		input = in.nextInt();
		if(input >= 0)
		{
			int recursive_factorial = factorial(input);
			System.out.println(" = "+recursive_factorial);
		}

		else
			System.out.println("Factorial of number less than 0 is not possible");

		in.close();
	}

}
