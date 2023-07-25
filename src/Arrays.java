
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]= {{1,2,3},{2,3,4}};
        int min = a[0][0];
        int max = a[0][0];
    	//System.out.print("[");
        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<3;j++)
        	{   
        		//logic to print smallest number in Array
        	/*	if(a[i][j]<min)
        		{
        			min=a[i][j];
        		}      */
        		
        		
				// logic to print largest number in Array
        		if (max<a[i][j])
        		{
        			max= a[i][j];
        		}
        		//System.out.print(a[i][j]);
        		//System.out.print("  ");
        	
        	}
        	//System.out.println("");
        }
        
       // System.out.println(min);
      System.out.println(max); 
	}

}
