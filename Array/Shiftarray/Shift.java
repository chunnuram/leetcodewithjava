class Shift
{
	static void shift(int x[])
	{
		int temp[]=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
					temp[i]=x[i];
					x[i]=x[j];
					x[j]=temp[i];
				}
			}
		}
     for(int i=0;i<x.length;i++)
	  {
		if(x[i]>0)
		{
			System.out.print(" "+x[i]);
		}
		else
		{
			
			System.out.print(" "+x[i]);
		}
	}
	}
	public static void main(String args[])
   {
		int x[]={1,-3,-2,3,2,-11,4,-12,13,-9,5,-1,-5,-7};
		shift(x);
   
   }
 }