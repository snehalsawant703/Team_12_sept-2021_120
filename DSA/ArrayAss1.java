class ArrayAss1
{
	public static void main(String args[])
	{
		int arr[]=new int[100];
		int n=0;
		arr[0]=20;
		arr[1]=35;
		arr[2]=37;
		arr[3]=40;
		arr[4]=45;
		arr[5]=50;
		arr[6]=51;
		arr[7]=55;
		arr[8]=67;
		n=8;
		
		int i;
		for(i=0;i<=n;i++)   //display
		{
			System.out.println(arr[i]);
		}
		
		//searching
		int key=37;
		for(i=0;i<=n;i++)
		{
		if(arr[i]==key)
			break;
		}
		if(i==n)
			System.out.println("not found");
		else
			System.out.println(i);
	}
}