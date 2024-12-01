class Median
{
	public static void main(String...g)
	{
		
		int Count=0;
		int  mm=0;
		int c,value=0;
		int temp=0;
		int ar[]=new int[]{13,13,13,13,14,15,16,18,21};
		//System.out.println("length="+ar.length);
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.print(" "+ar[i]);
		}
		System.out.println("");
		//System.out.println("length="+ar.length);
		if(ar.length%2==0)
		{
			c=ar.length/2;
			value=c;
			System.out.println("value="+ar[value]);	
		}
		if(ar.length%2!=0)
		{
			c=(ar.length+1)/2;
			value=c-1;
			System.out.println("value="+ar[value]);
		}
	}
}