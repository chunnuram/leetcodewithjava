public class MargeSort
{
	 static void margesort(int x[],int y[])
	{
		int z[]=new int[10];
		int temp=0;
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
			for(int j=0;j<y.length;j++)
			{
				z[j+x.length]=y[j];
			}
		
		}
		for(int i=0;i<z.length;i++)
		{
			for(int j=i+1;j<z.length;j++)
			{
				if(z[i]>z[j])
				{
					temp=z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		for(int i=0;i<z.length;i++)
		{
			for(int j=i+1;j<z.length;j++)
			{
				if(z[i]==z[j])
				{
					z[j]=0;
				}
			}
		}
		for(int i=0;i<z.length;i++)
		{
			if(z[i]>0)
			{
				System.out.println(""+z[i]);
			}
		}
	}
	public static void main(String args[])
	{
		int x[]={7,2,4,1};
		int y[]={8,5,4,2};
		margesort(x,y);
	}
}