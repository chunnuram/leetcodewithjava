public class Ducattriangle3
{

	public static void main(String args[])
	{
		try
		{
			String s="ducat";
			char ch[]=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				for(int j=0;j<ch.length-i;j++)
				{
					System.out.print(" "+ch[j]);
		        }
		        System.out.println("");
		   }	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}