class TriangleBMin
{
	static void trianglemin(int x[][])
	{
		int min=5;
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
		System.out.println("TriangleMin=");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i][j]<min)
				{
					min=x[i][j];
				}
				
			}
		}
		System.out.print("\t"+min);
		
	}
	public static void main(String...g)
	{
		int x[][]={{2,3,4},{3,4,2},{4,5,4}};
		trianglemin(x);
	}
}