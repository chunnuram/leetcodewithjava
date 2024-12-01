class MaixNOOfRow
{
	public static void main(String...g)
	{
		int sum=0,max=0;
		int ar[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int ar1[]=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				System.out.print("\t"+ar[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\t");
		System.out.println("Sum of Matrix");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				sum=sum+ar[i][j];
			}
			ar1[i]=sum;
			System.out.println(sum);
			sum=0;
		}
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar1.length;j++)
			{
				if(ar1[i]>max)
				{
					max=ar1[i];
				}
			}
		}
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]==max)
			{
				System.out.println("Maximax Number of Row="+(i+1)+"\nmaximam no of row value="+ar1[i]);
				
			}
		}
	}	
}