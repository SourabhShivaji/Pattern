package nested;// Name:print static and non static variable by object creation with the help of user define constructor
public class test 
{
	static int a=15;
	int b = 81;
	
	test()
	{
				 b= 14;
	}

	test(int i)
	{
				 b= 88;
	}
	public static void main(String[]args)
	{
		System.out.println("value of static variable a =" + a);
		System.out.println("test.a =" + test.a);
		System.out.println("a=" +a);
		
		test x = new test(13);
		test y = new test();
		
			System.out.println("x.b =" + x.b);
			System.out.println("y.b =" + y.b);
			
			System.out.println("x.a=" +x.a);
			System.out.println("y.a=" +y.a);
			
			x.a= 20;
			System.out.println("x.a=" +x.a);
			System.out.println("y.a=" +y.a);
			System.out.println("value of static variable a =" + a);
			System.out.println("test.a =" + test.a);
			System.out.println("a=" +a);
			
			x.b=100;
			System.out.println("x.b =" + x.b);
			System.out.println("y.b =" + y.b);
					
	}

}
