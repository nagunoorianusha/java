class Student
{
	public static void main(String args[])
 	{	
		String studentname="anu",section,distinction;
		int sid=202,scholarship,donation;
		int s1=75,s2=65,s3=76,s4=44,s5=90,s6=37,maxmarks=600,fee=74000;
		int total=s1+s2+s3+s4+s5+s6;
		double percentage=total/100.0*maxmarks;
		if(percentage<80)
		{
		section="A";
		scholarship=1000;
		donation=0;
		distinction="first class";
		}
		else
		{
		section="B";
		scholarship=0;
		donation=0;
		distinction="fail";
		}
		System.out.println("he is promoted to section   = " +section +"    scholarship is  "+scholarship 							+"    donation  = "+donation+"    distinction is  "+distinction);
		fee=fee+donation-scholarship;
		System.out.println("percentage   is " +percentage+ "  fee  "+fee);
	}
}