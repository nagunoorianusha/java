class Application
{
	public static void main(String args[])
		{
			String empname="anu";
			int empid=23;
			int basicsalary=25000,year=12;
			double grossalary,pf,tax,pack;
			double ta=15/100.0*basicsalary;
			double da=12/100.0*basicsalary;
			double hra=19/100.0*basicsalary;
			System.out.println("ta "+ ta + "da  " + da + " hra  "+ hra);
			double totalsalary=basicsalary+ta+da+hra;
			System.out.println("totalsalary  "  +  totalsalary);
			if(totalsalary>40000)
			{
			pf=11/100*basicsalary;
			tax=5/100*basicsalary;
			}
			else
			{
			pf=7/100*basicsalary;
			tax=2.5/100*basicsalary;
			}
			System.out.println("pf  " + pf + " tax " + tax);
			grossalary=totalsalary-pf-tax;
			System.out.println("grossalary " +grossalary);
			pack=grossalary*year;
			System.out.println("package  " + pack);
		}
}