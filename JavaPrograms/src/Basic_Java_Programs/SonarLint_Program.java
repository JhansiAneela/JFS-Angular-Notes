
package Basic_Java_Programs;

public class SonarLint_Program 
{
	public void operateNumber(int number)
	{
		number = 6;
		if(number>10)
		{
			System.out.println("number is greater than 10");
			
		}
	}
	public static void main(String[] args)
	{
		SonarLint_Program n = new SonarLint_Program();
		n.operateNumber(45);
		
		int a = 10, b = 0;
		int c = a/b;
		System.out.println(c);
	}	

}
