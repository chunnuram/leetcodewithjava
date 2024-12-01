public class AddMatrix
{
	
	static void add(int ar[][],int br[][])
	{
		int sum=0;
		System.out.println("firt Matrix=");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
					
				System.out.print("\t"+ar[i][j]);
			}
			System.out.println();
		}
		System.out.println("\t");
		System.out.println("Second Matrix=");
		for(int i=0;i<br.length;i++)
		{
			for(int j=0;j<br.length;j++)
			{
				System.out.print("\t"+br[i][j]);
			}
			System.out.println("");
		}
			System.out.println();
				System.out.println();
					System.out.println();
						System.out.println("Addition of Matrix=");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<br.length;j++)
			{
				sum=0;
				sum=ar[i][j]+br[i][j];
				System.out.print("\t"+sum);
			}
			System.out.println();
		}
		System.out.println("");
	}
	public static void main(String...g)
	{
		int ar[][]={{1,2,3},{4,5,6},{0,9,8}};
		int br[][]={{4,2,7},{6,4,5},{5,3,6}};
		add(ar,br);
	} 
}