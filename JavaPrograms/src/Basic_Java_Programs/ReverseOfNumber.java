package Basic_Java_Programs;

import java.util.Scanner;

public class ReverseOfNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int revnum = 0;
		
		int temp = num;
		
		while(num != 0)
		{
			int digit = num%10;
			revnum = revnum*10 + digit;
			num/=10;
		}
		
		System.out.println("Reversed number : " + revnum );
		
		if(temp == revnum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
			
			
	}

}
