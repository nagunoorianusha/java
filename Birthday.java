class Birth
{
	public static void main(String args[])
	{	
	String name="anu";
	int birthday=2002;
	int current_year=2023;
	int present_age=current_year-birthday;
	int days=365;
	int hour=24;
	int min=60;
	int week=7;
	days=days*present_age;
	hour=hour*days;
	min=min*hour;
	week=days/week;
	int month=30/7;
	System.out.println("month  "  +month);
	System.out.println("weeks"   +   week);
	System.out.println("minutes"  +   min);
	System.out.println("hour"  +   hour);
	System.out.println("days"  +   days);
	System.out.println("present  age"  +  present_age);
	}
}