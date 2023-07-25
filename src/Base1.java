
public class Base1 extends Base3{
	
	    int a;
	    int b;
	    
    
	
         public Base1(int a, int b)
         {
        	super(a,b);
			this.a=a;
			this.b=b;
		}





		public int square()
		  {
			
			
			int area;
			area= a*a;
			return area;
			
		}
		 
		 
		 public int Rectangle() 
		    {
				// TODO Auto-generated method stub
				
				int area;
				area= a*b;
				return area;
			}
	}


