package Basic_Java_Programs;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev)) // s.toLowerCase().equals(rev.toLowerCase()
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
	}

}
