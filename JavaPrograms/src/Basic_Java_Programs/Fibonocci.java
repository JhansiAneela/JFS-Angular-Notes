package Basic_Java_Programs;

import java.util.Scanner;

public class Fibonocci 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0, n2 =1, n3;
		int count = sc.nextInt();
		
		for(int i=2; i<=count; i++)
		{
									
			n3 = n1 + n2;
			System.out.println( n3);
			n1= n2;
			n2 = n3;
			
		}
	}

}
