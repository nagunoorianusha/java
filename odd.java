class odd
{
	public static void main(String args[])
	{
		int x=1,n=50,sum=0,mul=1;
		while(x<=n)
		{
		if(x%2==0)
		{
		sum=sum+x;
		System.out.println("the sum is "  + sum);
		x++;
		}
		else
		{
		mul=mul*x;
		System.out.println("the mul is " + mul );
		x++;
		}
		}
	}
}