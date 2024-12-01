class Hcf
{
	static void hcf(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				while(x[i]!=x[j])
				{
					if(x[i]>x[j])
					{
						x[i]=x[i]-x[j];
					}
					else
					{
						x[j]=x[j]-x[i];
					}	
				}
				System.out.print(""+x[j]);
			}
		}
	}
	public static void main(String args[])
	{
		int x[]={60,20};
		hcf(x);
	}
}