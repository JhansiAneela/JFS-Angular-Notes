package Basic_Java_Programs;

import java.util.Scanner;

public class OddAndEven 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size :");
		
		int size = sc.nextInt();
		int array[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Odd Numbers :");
		for(int i=0; i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				System.out.println(array[i]);
			}
		}
		
		
		System.out.println("Even Numbers :");
		for(int i=0; i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i]);
			}
		}
		
		
	}

}
