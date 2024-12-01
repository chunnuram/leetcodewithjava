class ArrayMaxNo
{
	public static void main(String...g)
	{
		int ar[]={0,1,2,3,4,5,3,5,3,5,6,6};
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
			System.out.println(""+max);
			
	}		
}   