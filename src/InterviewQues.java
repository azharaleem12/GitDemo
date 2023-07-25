
public class InterviewQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Print the largest number in a column of smallest number
		int a[][]= {{5,1,3},{2,4,6},{7,8,9}};
		int min = a[0][0];
		int i=0;
		int j=0;
		int mincol=0;
		//int k=0;
		for(;i<3;i++)
		{
			for(;j<3;j++)
			{
			
				if(a[i][j]<min)
	        		{
	        			min=a[i][j];
	        			mincol= j;
	        		}  
					
				}
				
			}
		System.out.println(mincol);
		int max = a[0][mincol];
		int k=0;
		while(k<3)
		{
			if(a[k][mincol]>max)
			{
			max= a[k][mincol];
			}
			k++;
		}
		System.out.println(max);
		//System.out.println(min);
		//a[i][j]=min;
		//System.out.println(a[i][j]);
		
	}

}
