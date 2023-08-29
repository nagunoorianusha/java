class Apple
{
	public static void main(String args[])
	{
	String mname="APPLEiphone 14(blue,128gb)";
	int cost=79900,packagefee=99;
	double final_cost=14.0/100*cost;
	double original_price=cost-final_cost;
	double total=packagefee+original_price;
	double cashback=5/100.0*total;
	double addcashback=total-cashback;
	double supercoins=addcashback/100;
	double addsupercoins=supercoins/2;
	System.out.println("14% offer " +final_cost);
	System.out.println(mname);
	System.out.println("discount"   + original_price);
	System.out.println("total price" +total);
	System.out.println("cash back"+cashback);
	System.out.println("cash back add"  +addcashback);
	System.out.println(supercoins);
	System.out.println(addsupercoins);
	}
}