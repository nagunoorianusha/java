class Assignment1
{
	public static void main(String args[])
	{
		int hardness=40;
		double carbon=0.8;
		int tensile=4000;
		if(hardness >=50 && carbon <=0.7 && tensile>=5600)	
		{
		System.out.println("three conditions are met the grade is 10 ");
		}
		else if(hardness>=50 && carbon <=0.7)
		{
		System.out.println("two conditions are met  the grade is 9");
		}
		else if(carbon<=0.7 && tensile >=5600)
		{
		System.out.println("the grade is 8");
		}
		else if(hardness>=50 && tensile >=5600)
		{
		System.out.println("the grade is 7");
		}
		else if(tensile>=5600)
		{
		System.out.println("only one condition is met the grade is 6");
		}
		else
		{
		System.out.println("no conditions are met the grade is 5");
		}
		
	}
}