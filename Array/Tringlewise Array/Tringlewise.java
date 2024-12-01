class Tringlewise
{
	static void trianglewise(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(i>=j)
				{
					System.out.print(" "+x[j]);
				}
				else
				{
					System.out.print(" ");
				}		
			}
			System.out.println("");
		}
	}
	public static void main(String args[])
	{
		int x[]={1,2,3,4,5};
		trianglewise(x);
	}
}