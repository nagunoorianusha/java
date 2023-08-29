class switchcase
{
	public static void main(String args[])
	{
		switch(4)
		{
		case 1:System.out.println("i like apple");
			break;
		case 2:System.out.println("i like mango");
			break;
		case 3:System.out.println("i like beetroot");
			break;
		case 4:System.out.println("i like pineapple");
			break;
		
		default:System.out.println("you are not selected any fruit");
		}


		//example

		char c='h';
		switch(1)
		{
		case 1:System.out.println( c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u' );
			System.out.println("they are vowels");
			break;
		default:System.out.println("they are consonants");
		}
		char s='A';
		switch(s)
		{
		case 'A':System.out.println("they are vowels" );
			break;
		case 'E':System.out.println("they are vowels" );
			break;
		case 'I':System.out.println("they are vowels" );
			break;
		case 'O':System.out.println("they are vowels" );
			break;
		case 'U':System.out.println("they are vowels" );
			break;
		
		default:System.out.println("they are consonants");
		}
		
		
	}
}