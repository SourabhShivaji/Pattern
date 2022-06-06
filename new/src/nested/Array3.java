package nested;
//Reverse the given array
public class Array3 {
	public static void main(String[]args)
	{
		int a [] = {12,85,65,23};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +",");
			
		}
		System.out.println("");
		
			
		int [] b = new int[a.length];
		for(int i=0;i<a.length;i++)
		{                                      
			b[i]=a[(a.length-1)-i];
		}
		
				a=b;
				
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] +",");
		}
					
	}
}
  


