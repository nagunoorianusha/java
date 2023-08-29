class Laptop
{
	public static void main(String args[])
	{
	String name="hp laptop 14s";
	String ram="16 GB RAM";
	String stylename="12th gen intel core i5";
	String patternName="laptop";
	String color="silver";
	int maxprice=72331;
	double delivery_charges=150;
	int debitcard=4500;
	int quantity=1;
	double exchange=11200;
	double offerprice=14.0/100*maxprice;
	double finalprice=maxprice-offerprice;
	double debitcardprice=finalprice-debitcard;
	exchange=finalprice-exchange;
	delivery_charges=finalprice-delivery_charges;
	System.out.println("latop name is : " + name);
	System.out.println("size is : " + ram);
	System.out.println("stylename for the laptop is : " +stylename);
	System.out.println("laptop pattern Name is : " +patternName);
	System.out.println("latop color is : " +color);
	System.out.println("latop maximum price is : " +maxprice);
	System.out.println("with debit card price is : " +debitcard);
	System.out.println("quantity  is : " + quantity);
	System.out.println("laptop with offer  : " + offerprice);
	System.out.println("offer price is : " + finalprice);
	System.out.println("exchange old product   : " + exchange);
	System.out.println("delivery charges : " + delivery_charges); 
	}
}