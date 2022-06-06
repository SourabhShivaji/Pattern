package nested;

public class Patern8 
{
	public static void main(String[]args)
	{
		for(int line = 1;line<=10;line++)  
		{
			for(int space=9;space>=line;space--)   
			{
				System.out.print(" "); 
			}
			for(int star=1;star<=line;star++)
			{
				System.out.print("* ");
			}
				System.out.println(" ");
		}
		
		for(int line = 1;line<=9;line++)  
		{
			for(int space=1;space<=line;space++)   
			{
				System.out.print(" "); 
			}
			for(int star=9;star>=line;star--)
			{
				System.out.print("* ");
			}
				System.out.println(" ");
		}
		
	}
}
