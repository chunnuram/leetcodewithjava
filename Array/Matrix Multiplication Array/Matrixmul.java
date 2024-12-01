class Matrixmul
{
	static void matrixmul(int x[][],int y[][])
	{
		int b=0;
		int z[][]=new int[3][3];
		System.out.println("Print the tow matrix => ");
	    for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.print("\t");
			for(int j=0;j<y.length;j++)
			{
				System.out.print("  "+y[i][j]);
			}
			System.out.println("");
		}
				System.out.println("\t");
				System.out.println("multiplication of tow matrix => ");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{		
				int sum=0;
					for(int k=0;k<x.length;k++)
					{
						sum=sum+x[i][k]*y[k][j];
					    z[i][j]=sum;
					}					
				   System.out.print("\t ");
			}
			System.out.println("");
		}
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z.length;j++)
			{
				System.out.print("\t"+z[i][j]);
			}
			System.out.println("\t");
	    }
	}
	public static void main(String args[])
	{
		int x[][]={{5,6,6},{8,7,9},{5,6,7}};
		int y[][]={{1,3,2},{8,7,9},{5,5,6}};
		matrixmul(x,y);
		
	}
}