class LCM12
{
	public static void main(String...g)
	{
		int ar[]={10,12,15};
		int c=0;
		int n=2;
		int add=1;
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			while(ar[i]>1)
			{
				for(int j=0;j<ar.length;j++)
				{
					if(ar[j]%n==0)
					{
						ar[j]=ar[j]/n;
						count++;
					}
				}
				if(count>0)
				{
					add=add*n;
				}
				if(count==0)
				{
					n++;
				}
				count=0;
			}
						
	}
	System.out.println(""+add);
	}
}