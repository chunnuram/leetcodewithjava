class Triangle
{
	static int sum=0;
	static void triangle(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print("\t"+a[i][j]);
			
		}
		System.out.print("\t\t");
		for(int k=0;k<i;k++)
		{
			System.out.print("\t");
		}
		for(int j=i;j<a.length;j++)
		{
			System.out.print("\t"+a[i][j]);
		}
		   System.out.println();
					       
		}
	}
	public static void main(String args[])
	   {
			int a[][]={{9,4,2},{1,8,5},{4,5,6}};
			triangle(a);	
	   }
	}	   
				 
  