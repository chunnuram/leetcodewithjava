class MatrixSum
{
	static  void matrixsum(int x[][])
	{
		int c=0;
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
			
	
				System.out.print("  "+x[i][j]);
		}
			
			System.out.println();
	
		}
		System.out.println("\t");
		System.out.println("Matrixsum=");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
		
				sum=sum+x[i][j];
				
			}
				
			System.out.println(" \t"+sum);
			sum=0;
		}
		//System.out.println();
	}
	
	public static void main(String...g)
	{
		int x[][]={{3,2,4},{5,4,5},{6,7,6}};
		matrixsum(x);
	}
}