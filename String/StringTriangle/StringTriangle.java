class StringTriangle
{
	static void stringtriangle(String s1,String s2)
	{
		int sum=0;
		char ar[]=s1.toCharArray();
		char br[]=s2.toCharArray();
			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length-i;j++)
				{
					System.out.print(""+ar[j]);
		        }	
			System.out.print("\t");
			for(int j=0;j<br.length;j++)
			{
				if(i<=j)
				{
					System.out.print(""+br[j]);
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
		String s1="ducat";
		String s2="ducat";
		stringtriangle(s1,s2);
	}
}