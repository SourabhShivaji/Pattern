package nested;
public class Xalphabet {
	public static void main(String[]args)
	{
		{
			  for(int line=1;line<=5;line++)
			  {
				  for(int star=1;star<=5;star++)
				  {
					  if(line==star || line+star == 6)
					  {
						  System.out.print("*");
			           }
					  else
					  {
						  System.out.print(" ");
					  }
				  }
				  System.out.println("");
			  }
		}
	}
}
		
	
	
	
	
	

