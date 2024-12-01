class ArraySort
{
	public static void main(String...g)
	{
		int temp=0;
		int x[]={6,1,2,3,4,7,5,6};
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
		
	}
}