package nested;

public class HelloSquareWithDiagonal {
	public static void main(String args[])
	  {
	     
		for(int line=1;line<=5;line++)
	      {
	        
	          for(int star=1;star<=5;star++)
	          {
	              
	              if(line==1 || line==5 || star==1 || star==5 || line == star || star == 6-line)
	              {
	              System.out.print("*  ");
	              }
	              
	              else
	              System.out.print("   ");
	          }
	          System.out.println();
	      }
	  }

}
