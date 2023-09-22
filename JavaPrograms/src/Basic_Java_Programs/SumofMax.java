
/*
 sara gave an assignment to her students. 
 She gave a set of numbers to her students and the students have to 
 add the 1st -maximum number and the 1st  minimum number and 
 the 2nd maximum number and the 2nd minimum number up to the nth number. 
 From that number, the students have to print the maximum number. 

Requirements:

The size of the array should be greater than 1 and 
the size should be an even number, else print "<size> is an invalid number".

Sample Input/Output 1:

Enter the array size

6

Enter the number

23

48

15

68

90

10

************* The maximum number is 100

Explanation:

1st maximum number = 90

1st minimum number = 10

Sum of 1st max and min = 100

2nd maximum number = 68

2nd minimum number = 15

Sum of 2nd max and min = 83

3rd  maximum number = 48

3rd minimum number = 23

Sum of 3rd max and min = 71

Output will be "The maximum number is 100"
 
 
 */



package Basic_Java_Programs;

import java.util.Scanner;
import java.util.Arrays;

public class SumofMax 
{


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the array size");
		
		try
		{
			int size = sc.nextInt();
		
			int array[] = new int[size];
		
			if(size > 1 && size%2 ==0)
			{
				System.out.println("Enter the number");
			
				for(int i=0; i<size; i++)
				{
					array[i] = sc.nextInt();
				}
			
		
			}
		
			else
			{
				System.out.println("Invalid number");
				return;
			}
			
			int max = array[0];
			int min = array[0];
		
			for(int i=0; i<size; i++)
			{
				if(array[i] > max)
				{
					max = array[i];
				}
				if(array[i] < min)
				{
					min = array[i];
				}			
	
			}
			
			/*
			Arrays.sort(array);
			int max = array[size-1];
			int min = array[0];
			
			
			 */
		
			int sum = max+min;
			System.out.println("The maximum number is " + sum);
		
		}
		
		catch(NegativeArraySizeException e)
		{
			 System.out.println("Invalid number");
			 
		}
		
		
		
	}
}




