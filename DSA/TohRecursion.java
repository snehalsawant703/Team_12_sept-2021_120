class TohRecursion
{
	static void toh(int n, char s, char i, char d)
	{
		if(n==1)
			System.out.println("Disk"+n+"From"+s+"to"+d);
		else
		{
			toh(n-1,s,d,i);
			System.out.println("Disk"+n+"From"+s+"to"+d);
			toh(n-1,s,d,i);
		}
	}
	public static void main(String args[])
	{
		toh(3,'A','B','C');
	}
}




