
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int sum=0;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<10;i++)
		{
			//System.out.println(sum);
			sum=a+b;
			//System.out.println(a);
			//System.out.println(b);
			System.out.println(sum);
			a=b;
			b=sum;

			
		}
	

	}

}
