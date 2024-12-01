class MaxNumberFind
{
	static int max1(int x[][])
	{
		int max1=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i][j]>max1)
				{
					max1=x[i][j];
				}
			}
		}
		System.out.println(""+max1);
		return 0;
	}
	public static void main(String...g)
	{
		int x[][]={{9,8,7},{1,2,3},{3,4,5}};
		max1(x);
	}
}