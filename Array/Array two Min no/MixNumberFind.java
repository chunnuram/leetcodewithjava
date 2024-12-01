class MixNumberFind
{
	static int mix1(int x[][])
	{
		int mix1=9;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i][j]<mix1)
				{
					mix1=x[i][j];
				}
			}
		}
		System.out.println(""+mix1);
		return 0;
	}
	public static void main(String...g)
	{
		int x[][]={{9,8,7},{1,2,3},{3,4,5}};
		mix1(x);
	}
}