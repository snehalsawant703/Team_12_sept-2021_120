import java.util.*;
class L6
{
	public static void main(String args[])
	{
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the first number : ");
	int a=ss.nextInt();
	System.out.println("Enter the second number : ");
	int b=ss.nextInt();
	
	int sum=a+b;
	int mul=a*b;
	int sub=a-b;
	int div=a/b;
	int mod=a%b;
	System.out.println("The addition of "+a+" and "+b+" is "+sum);
	System.out.println("The multiplication of "+a+" and "+b+" is "+mul);
	System.out.println("The substraction of "+a+" and "+b+" is "+sub);
	System.out.println("The division of "+a+" and "+b+" is "+div);
	System.out.println("The modulas of "+a+" and "+b+" is "+mod);
	
	}
}