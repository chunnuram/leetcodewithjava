class Decimaltobinary12
{
	public static void main(String args[])
	{
		int n=10,N=n,i,count=0,b=0,a=0;
		while(n>0)
		{
			n=n/2;
			count++;
		}
		int ar[]=new int [count];
		while(N>0)
		{
			b=N%2;
			ar[a]=b;
			N=N/2;
			a++;
		}
		for(i=ar.length-1;i>=0;i--)
		{
			System.out.print(" "+ar[i]);
		}
	}
}