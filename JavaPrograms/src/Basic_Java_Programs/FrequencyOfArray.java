package Basic_Java_Programs;

import java.util.Scanner;

public class FrequencyOfArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int count = 0;
		int array[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		
		for(int j=0; j<array.length; j++)
		{
			if(array[j]== 0)
			{
				count++;
			}		
			
		}
		
		System.out.println(count);

	}

}

