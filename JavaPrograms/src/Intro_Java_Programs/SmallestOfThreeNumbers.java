package Intro_Java_Programs;

import java.util.Scanner;

public class SmallestOfThreeNumbers 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(b);
		}
		
		else if(b>c)
		{
			System.out.println(c);
		}
		
		else
		{
			System.out.println(a);
		}
		
		// using ternary operator 
		
		int res = (a < b) ? a : b ;
		
		int min = (c < res) ? c : res;
		
		System.out.println(min);
		
		
		
		
	}

}
