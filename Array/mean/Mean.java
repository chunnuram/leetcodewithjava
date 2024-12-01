class Mean
{
	public static void main(String...g)
	{		
		int sum=0;
		double mm=0.0;
		int temp=0;
		int ar[]=new int[]{13,18,13,14,13,16,14,21,13};
		System.out.println("length="+ar.length);
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
			System.out.println(" "+ar[i]);
		}
		/*for( int c:ar)  //foreach loop new loop
		{
			sum=sum+c;
		}*/
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		mm=sum/ar.length;
		System.out.println();
		System.out.println("mean="+mm);
	}
}