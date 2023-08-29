class Salary
{
	public static void main(String args[])
	{
		int total=1500,discount;
		if(total>2000)
		{
		discount=10/100*total;
		System.out.println("discount 10% added");
		}
		else
		{
		discount=5/100*total;
		System.out.println("discount 5% added");
		}
	}
}	 