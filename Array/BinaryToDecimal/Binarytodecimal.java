class Binarytodecimal
{
	static void binarytodecimal(int n[])
	{
		int sum=0;
		int i=1;
		int r=0;
		for(int j=0;j<n.length;j++)
		while(n[j]>0)
		{
			for(int k=0;k<n.length;k++)
			{
				r=n[k]%10;
				sum=sum+r*i;
				i=i*2;
				n[k]=n[k]/10;
			}   
		}
		System.out.println(""+sum);
	}
	public static void main(String...s)
	{
		int n[]={1010};
		binarytodecimal(n);
	}
}