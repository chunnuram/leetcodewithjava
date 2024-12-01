class ArrayMax
{
	static int max(int a[])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
				
		}
		System.out.println(max);
		return 0;
	}
	public static void main(String...g)
	{
		int a[]={6,7,8,5,6,4,3};
		max(a);
	
		
	}
}