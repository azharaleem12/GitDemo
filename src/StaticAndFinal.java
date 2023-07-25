
public class StaticAndFinal {
	
	static int a;
	static int c;
	final int b= 5;
	static int sum;
	
	//Static block can contain only static values
	static
	{
		a=8;
	    c=9;
	  
	}
	
	public static void sum1()
	{
		sum=a+c;
		System.out.println(sum);
		a++;
	
	}
	
	public void sum2()
	{
	      int b=8;
		    b++;
		  sum= a+b;
		System.out.println(sum);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndFinal sf=new StaticAndFinal();
	//	sf.sum1();
		//static method can be called through classname.method
		StaticAndFinal.sum1();
		//non static method can be called through object
		sf.sum2();
	}

}
