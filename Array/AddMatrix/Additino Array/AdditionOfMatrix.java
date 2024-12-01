class AdditionOfMatrix
{
	static void addofmatrix(int ar[][],int br[][])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				System.out.print("\t"+ar[i][j]);
			}
			System.out.print("\t");
			for(int j=0;j<br.length;j++)
			{
				System.out.print("\t"+br[i][j]);
			}
			System.out.println();
		}
		System.out.println("\t");
		System.out.println("");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<br.length;j++)
			{
				sum=0;
				sum=sum+ar[i][j]+br[i][j];
			System.out.print("\t"+sum);
			}
			System.out.println("");
			System.out.println("");
		}
	}
	public static void main(String args[])
	{
		int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
		int br[][]={{0,9,8},{7,6,5},{4,3,2}};
		addofmatrix(ar,br);
	}
}