class vowel
{
	public static void main(String args[])
	{
		char x='#';
		if(x=='A'||x=='E'||x=='i'||x=='O'||x=='U')
		{
		System.out.println("capital letters  "  + x );
		System.out.println("they are vowels");
		}
		else if(x=='a'|| x=='e'||x=='i'||x=='o'||x=='u')
		{
		System.out.println("small letter");
		System.out.println("they are vowels");
		}
		else if(x>=97&&x<=122)
		{
		System.out.println("they are consonants ");
		System.out.println("small letters");
		}
		else if(x>=65 && x<=90)
		{
		System.out.println("they are consonants ");
		System.out.println("capital letters");
		}
		int c=(int)x;
		else if(x>=0 && x<=9)
		{
		System.out.println("they are numbers");
		}
		else
		{
		System.out.println("they are symbols");
		}
	}
}
		