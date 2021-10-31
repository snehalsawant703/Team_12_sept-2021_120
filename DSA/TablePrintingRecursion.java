class TablePrintingRecursion
{
	static int print(int n)
	{
		if(n>=11)
			return 10;
		else 
		{
			System.out.println("5*"+n+"="+5*n);
			return print(n+1);
		}
			
	}
	public static void main(String args[])
	{
		print(1);
	}
}