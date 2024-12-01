class SpaceRemoveRight
{
	static String removeleftspace(String s)
	{
		int count=0;
		int space=' ';
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==space)
			{
				count++;
			}
			else
			{
				break;
			}
		}
		System.out.println("Right space="+count);
		for(int i=count;i<ch.length-count;i++)
		{
			System.out.print(""+ch[i]);
		}
		return "0";
	}
	public static void main(String...g){
		
		String s="          Ram is good boy          ";
		removeleftspace(s);
	}
}