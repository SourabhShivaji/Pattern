package nested;
public class nested {
	public static void main(String[] args)
	{
		int a = 600;
	    int b = 200;
	    int c=  300;
	    int d=  1240;
	    if (a>b)
	{ 
		if(a>c)
		{
			if(a>d)
			{
				System.out.print("a is graeter and its value is" + a);
			}
			else
			{
				System.out.print("d is graeter and its value is" + d);
			}
		}
			else
			{
				if(c>d)
				{
					System.out.print("c is graeter and its value is" + c);
				}
				else
				{
					System.out.print("d is graeter and its value is" + d);
				}
			}
	}
	    else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.print("b is graeter and its value is" + b);
				}
				else
				{
					System.out.print("d is graeter and its value is" + b);
				}
			}
				else
				{
					if(c>d)
					{
						System.out.print(" and its value is" + c);
					}
					else
					{
						System.out.print("d is graeter and its value is" + d);
					}
				}
		}
}

}

