class TriangleSum
{
	static void trianglesum(int x[][])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				System.out.print("\t"+x[i][j]);
			}
		System.out.print("\t\t");
		for(int k=0;k<=i;k++)
		{
			System.out.print("\t");
		}
		for(int j=i;j<x.length;j++)
		{
			System.out.print("\t"+x[i][j]);
		}
		System.out.println("");
		}
		System.out.println("\n\n");
		System.out.println("\tSumTriangle=");
		for(int i=0;i<x.length;i++)
		{
		for(int j=i;j<x.length;j++)
		{
			sum=sum+x[i][j];
		}
		System.out.println("\t\t "+sum);
		sum=0;
		}
		//System.out.println("");
	}
	public static void main(String...g)
	{
		int x[][]={{1,2,3},{3,3,4},{5,6,6}};
		trianglesum(x);
	}
}