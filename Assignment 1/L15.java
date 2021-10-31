import java.util.*;
class L15
{
	public static void main(String args[])
	{
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter 1st number a=: ");
	int a= ss.nextInt();
	System.out.println("Enter 2nd number b=: ");
	int b= ss.nextInt();
	System.out.println("swap no.a="+a+" and "+b+" is :");
	int c=0;
	c=a;
	a=b;
	b=c;
	System.out.println( "a=" +a+ "  b= "+b);
	}
}

