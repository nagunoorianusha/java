class insurance
{
	public static void main(String args[])
	{
	 	String name="ram",name1="anu";
		String gender="male",gender1="female",village="vdp";
		String health="excellent",health1="poor";
		String city="hyd",person="insured",person1="not insured";
		int premium=4,age=35;
		int premium1=3,premium2=6;
		int policy=200000/1000*4;
		int policy1=100000/1000*3;
		int policy2=10000/1000*6;
		if(age<25&&age>25)
		{
		System.out.println("policy amount  for male  "  +  policy);
		}
		else if(gender1!="female"&&premium1==3)
		{
		System.out.println("policy amount for female   "  +  policy1);
		}
		else if(gender!="male"&&health1=="poor")
		{
		System.out.println("policy amount for premium 6 for thousand  " + policy2);	
		}
		else if(person!="insured")
		{
		System.out.println("person is   "  +  person);
		}
		else if(person1=="not insured")
		{
		System.out.println("person is  "  + person1);
		}
	}
}