package Basic_Java_Programs;

public class Star_Pattern 
{
	public static void main(String[] args)
	{
		int row = 6;
		
		for(int i = 1; i<=row; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.println("* ");
			}
			
			System.out.println();
		}
	}

}
