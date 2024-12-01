class SumOfMatrix
{
	public static void main(String...g)
	{
		int sum=0;
		int ar[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Matrix=");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				System.out.print("\t"+ar[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\t");
		System.out.println("");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				sum=sum+ar[i][j];
			}
		}
		System.out.print("\tSum of Matrix=\t"+sum);
	}
}