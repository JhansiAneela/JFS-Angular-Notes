package Basic_Java_Programs;

import java.util.Scanner;

public class FrequencyOfInInteger {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		
		String numstr = Integer.toString(num);
		
		for(int i=0;i< numstr.length(); i++)
		{
			if(numstr.charAt(i) == '0')
			{
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
