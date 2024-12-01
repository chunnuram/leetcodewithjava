class MinArray
{
	static int min(int ar[])
	{
		int min=9;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println(min);
		return 0;
	}
	public static void main(String...g)
	{
		int ar[]={9,8,7,6,5,4,3};
		min(ar);
	}
}