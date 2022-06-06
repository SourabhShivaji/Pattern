package nested;
//Reverse the array
public class Array2 {
	public static void main(String[]args)
	{
		int a [] = {12,85,65,23};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +",");
			
		}
		System.out.println("");
			
		int [] b = new int[a.length];
		b[0]=a[3];
		b[1]=a[2];
		b[2]=a[1];
		b[3]=a[0];
		
		a=b;
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] +",");
		}
					
	}
}
        
