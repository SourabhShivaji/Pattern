package nested;

public class variables {
	static int a = 45;
	int b = 68;
	
	variables()
	{
		a=56;
		b= 25;
		int j = 43;
		System.out.println(j);
	}
	public static void main(String[] args)
	{
		int a =65;
		int g =455;
		//System.out.println(j);
		System.out.println(a);
		System.out.println(variables.a);
		
		variables x = new variables();
		System.out.println(x.a);
		System.out.println(x.b);
		//System.out.println(x.j);
		System.out.println(variables.a);
		
				
	}

}
