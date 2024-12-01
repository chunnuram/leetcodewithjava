class TriangleB
{
	static void trianglemax(int x[][])
	{
		int max=0;
		int temp=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(i<=j)
				{
					System.out.print("\t"+x[i][j]);
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("");
			
		}
		System.out.println("TriangleMax=");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i][j]>max)
				{
					max=x[i][j];
				}
				
			}
		}
		System.out.print("\t"+max);
		
	}
	public static void main(String...g)
	{
		int x[][]={{2,3,4},{3,4,2},{4,5,4}};
		trianglemax(x);
	}
}