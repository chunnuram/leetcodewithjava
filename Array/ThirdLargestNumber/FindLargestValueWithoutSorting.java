class FindLargestValueWithoutSorting
{
	public static void main(String args[])
	{
		int i,j,k,max=0,max1=0;
		int ar[]={4,5,6,1,7,2,8,3,9,13,19};
		int num=3;
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		max++;
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]<max)
			{
				max=ar[i];
			}
		}
		max--;
		while(num>0)
		{
			for(i=0;i<ar.length;i++)
			{
				if(ar[i]>max1)
				{
					max1=ar[i];
				}
			}
			if(num>1)
			{
				for(i=0;i<ar.length;i++)
				{
					if(ar[i]==max1)
					{
						ar[i]=max++;
					}
				}
				max1=0;
			}
			num--;
		}
		System.out.println(max1);
	}
}