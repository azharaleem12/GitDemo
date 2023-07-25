
public class ExceptionEx {
	
	
	//static int a[]= {8,9,0,4,1};
	//static int i=0;
	//static int res=0;
	
	public void array()
	{  
	    //int a[]= {8,9,0,4,1};
		//int res=0;
		//int i=0;
		int a=8;
		int b=0;
		int c;
		try
		{
			
			{
				c=a/b;
				System.out.println(c);
			}
		}
		catch(ArithmeticException Ex)
		{
			System.out.println("hello");
		}
	
	}

	
	
	

	public static void main(String[] args) {
		
		ExceptionEx Exe= new ExceptionEx();
		Exe.array();
		
	/*	try
		{
		
			for(int i=0;i<a[i];i++)
			{
				System.out.println(a[8]);
			}
		
		}
		
		catch(Exception E)
		{
			System.out.println("Me");
		}
		*/

	}

}

