
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int k = 10;
          for(int i=0;i<4;i++)  
          {
          //System.out.println(i);
          for(int j=0;j<4-i;j++)
          {
        	  System.out.print(k); 
        	  System.out.print("\t");
        	  k--;
          }
          System.out.println("");
          }
          
	}

}
