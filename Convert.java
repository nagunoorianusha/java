class Convert
{
	public static void main(String args[])
	{
		char c='a';
		int b,s=0;
		b=(int)(c);
		if(b>=65)
		{
		if(b<=90)
		{
		s=b+32;
		}
		else if(b>=97)
		{
		if(b<=122)
		{
		s=b-32;
		}
		}
		}
		s=(char)s;
		System.out.println("s  " + s);
		
	}
}