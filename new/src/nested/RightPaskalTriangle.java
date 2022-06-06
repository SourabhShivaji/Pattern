package nested;
public class RightPaskalTriangle 
{
 public static void main(String[]args)
 {
	 for(int line =1;line<=5;line++)
		{
			for(int star=1;star<=line;star++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for(int line=1;line<=4;line++)
		{
			for(int star=4;star>=line;star--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
 }
}
