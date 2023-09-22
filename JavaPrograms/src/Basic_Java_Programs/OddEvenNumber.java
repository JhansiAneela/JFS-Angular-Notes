package Basic_Java_Programs;

import java.util.Scanner;

public class OddEvenNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			
		int num = sc.nextInt();
		
		
			if(num%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		
	}
	
	
}
