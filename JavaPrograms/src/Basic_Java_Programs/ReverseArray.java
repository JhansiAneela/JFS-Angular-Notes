package Basic_Java_Programs;

import java.util.Scanner;

public class ReverseArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int array[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original Array");
		
		for(int j=0; j<array.length; j++)
		{
			System.out.println(array[j] + "");
		}
		
		System.out.println();
		
		System.out.println("Array in Reverse Order");
		
		for(int k=array.length-1; k>=0; k--)
		{
			System.out.println(array[k] + "");
		}
		
	}

}
