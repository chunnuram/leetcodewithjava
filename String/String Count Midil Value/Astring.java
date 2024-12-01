class Astring
{
	String s1="chunnuradhey";
	int  max=0;
	void show()
	{
		System.out.println("");
		System.out.println(s1.length());
		if(s1.length()%2==0)
		
		{
		
			max=s1.length()/2;
			System.out.print(s1.charAt(max-1));
			System.out.print(s1.charAt(max));
			
		}
		else
		{
			max =s1.length()/2;
			System.out.print(s1.charAt(max-1));
			System.out.print(s1.charAt(max));
			System.out.print(s1.charAt(max+1));
		}
	
	}
	public static void main(String...s)
	{
		Astring ob=new Astring();
		ob.show();
		
	
	}
}