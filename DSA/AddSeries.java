class AddSeries
{
	static double add(double n)
	{
		if(n>=5)
			return 4;
		else
			return 1/add(n+1);
	}
	public static void main(String args[])
	{
		System.out.println(add(1));
	}
}