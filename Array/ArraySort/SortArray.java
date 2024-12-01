class SortArray
{
	static int sortarray(int x[])
	{
		int temp=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+i;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
			System.out.println(""+x[i]);
		}
		return 0;
	}
	public static void main(String...g)
	{
		int x[]={9,8,7,6,5,4,0};
		sortarray(x);
	}
}