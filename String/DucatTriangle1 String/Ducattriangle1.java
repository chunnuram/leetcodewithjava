public class Ducattriangle1
{

	public static void main(String args[])
	{
		try
		{
			String s="ducat";
			char ch[]=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				for(int j=0;j<ch.length;j++)
				{
				if(i>=j)
				{
					System.out.print(" "+ch[j]);
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println(" ");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}