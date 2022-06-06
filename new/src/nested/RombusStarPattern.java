package nested;

public class RombusStarPattern 
{
	public static void main(String[]args)
	{
	for(int line=1;line<=5;line++)
	{
		for(int space=4;space>=line;space--)
			{
				System.out.print(" ");
			}
		
		for(int star=1;star<=5;star++)
		   {
			 System.out.print("* ");
		   }
		
		System.out.println("");
	}

}
}
