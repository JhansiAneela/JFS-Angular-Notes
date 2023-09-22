package Intro_Java_Programs;

import java.util.Scanner;

public class ReverseAndExpand 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int rev = 0;
		
		if(num >= 1000 && num <= 9999)
		{
			while(num > 0)
			{
				int digit = num%10;
				rev = rev*10 + digit;
				num = num/10;
			}
			System.out.println(rev);
		}
		
		else
		{
			System.out.println("Invalid number");
		}
	}

}
