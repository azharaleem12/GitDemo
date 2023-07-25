
public class ConstructorsEx {
	
	//Default Constructors
	 
    /*public  ConstructorsEx()
	{
		System.out.println("Hello");
	}
	*/
	//Parameterized Constructor
	public  ConstructorsEx(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	
	int a;
	int b;
	
	public int sum()
	{
		System.out.println(a+b);
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
             ConstructorsEx E=new  ConstructorsEx(5,6);
             E.sum();
             
	}

}
