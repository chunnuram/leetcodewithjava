class ArrayMin
{
	public static void main(String...g)
	{
		int ar[]={9,8,7,6,7,5,6};
		int min=9;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println(min);
	}
}