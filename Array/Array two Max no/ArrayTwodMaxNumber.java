class ArrayTwodMaxNumber
{
	public static void main(String...g)
	{
		int ar[][]={{9,8,7,},{6,5,4},{3,2,1}};
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i][j]>max)
				{
					max=ar[i][j];
				}
			}
		}
		System.out.println(""+max);
	}
}