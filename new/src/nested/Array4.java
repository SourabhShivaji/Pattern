package nested;//print the array in desending order the array with help of swaping

public class Array4 {
	public static void main (String []main) {
		int a [] = {14,10,20,30,40};
		System.out.print(" Original array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + ",");
		} 
				int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			 if(a[i]<a[j])
			  {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			   }
			}
		}
		System.out.println("");		
		System.out.print("Dsending order array:");
		
		for(int i=0;i<a.length;i++)
		{
		 System.out.print(a[i] + ",");

         }
}
}
