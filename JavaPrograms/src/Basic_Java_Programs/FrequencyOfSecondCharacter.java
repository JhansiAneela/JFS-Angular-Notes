package Basic_Java_Programs;

import java.util.Scanner;

public class FrequencyOfSecondCharacter 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		s = s.toLowerCase();
		
		char ch = sc.next().charAt(0); // to count any character frequency
		
		char ch1 = s.charAt(1);  // to count only second character frequency
		
		int count = 0;
		
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i) == ch)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
