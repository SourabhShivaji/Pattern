package nested;
public class Pattern5 
{
	public static void main(String[]args)
	{
		for(int line=1;line<=10;line++)
		{
			for(int star=1;star<=line;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		 }
		
		System.out.println();
		
		for(int line=1;line<=10;line++)
		{
			for(int star=10;star>=line;star--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
      }
 }
	