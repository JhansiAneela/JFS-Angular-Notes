
/* 
 
 * Sita's teacher gives her an assignment to find the letters 
 * between the two given indexes of the word. 
 * Help Sita to complete her assignment by writing a program in java.
 
 * Sample Input1:

	Environment

	5

	10

	Sample Output1:

	onmen 
*/



package Basic_Java_Programs;

import java.util.Scanner;

public class FindLetters {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        
        String s =  sc.nextLine();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = s.substring(a,b);
        System.out.println(result);

	}

}
