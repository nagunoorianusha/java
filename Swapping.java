class Swapping
{
	public static void main(String args[])
		{
			int x=10,y=5;
			System.out.println("before swap" +  "  x  "  +  x  +  "  y  " + y);
			if(x%y==0)
			{
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("after swap");
			System.out.println("  x "  +  x  + "  y  "+ y    );																		}
		}
}				