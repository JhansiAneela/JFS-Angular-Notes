package Intro_Java_Programs;

import java.util.Scanner;

public class Swap_Two_Numbers 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// using third variable
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		
		System.out.println("Before Swapping :");
		System.out.println(a);
		System.out.println(b);
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping :");
		System.out.println(a);
		System.out.println(b);
		
		
		// without using third variable
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping :");
		System.out.println(a);
		System.out.println(b);
		
		
		// using bitwise operator
		
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		
		System.out.println("After Swapping :");
		System.out.println(a);
		System.out.println(b);
		
				
		
		 
		
		
		
		
		
	}

}
