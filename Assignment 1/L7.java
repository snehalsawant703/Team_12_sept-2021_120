import java.util.*;
class L7
{
	public static void main(String args[])
	{
	Scanner ss= new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=ss.nextInt();
	int mul=1;
	System.out.println("The table of "+num);
	for(int i=1;i<=10;i++)
	{
		mul=num*i;
		System.out.println(num+" * "+i+" = "+mul);
	}
	}
}
	