package nested;
public class Array {
	public static void main(String[]args) 
	{
		int a []= {10,20,40,7};            //first method declaration + initialisation
		char [] b = {'E','%','2'};
		System.out.println(a[0]);         // print the value
		System.out.println(b[1]);
		a[0]=20;                           // assign new value
		System.out.println(a[0]);          // print new assigned value
		
		int c [] = new int [2];       // declartion
		char [] d = new char [3];
		c[0]=10;                        // Assign value
		c[1]=11;
				
		d[0]='$';
		d[1]='+';
		d[2]='^';;
		System.out.println(c[1]);         // print the valu
		System.out.println(d[2]);
		c[1]=1050;                       // assign new value
		System.out.println(c[1]);        // print new assigned value
		
		int size = d.length ;
		System.out.println("size of d is  "  +   size);
		}

              }
