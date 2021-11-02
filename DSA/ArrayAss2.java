class ArrayAss2
{
	public static void main(String args[])
	{
		int arr[]=new int[]{10,20,80,30,60,50,110,100,130,170};
		int n=arr.length;
		int i;
		for(i=0;i<n;i++)   //display
		{
			System.out.println(arr[i]);
		}
		
		//searching
		int key1=110;
		for(i=0;i<n;i++)
		{
		if(arr[i]==key1)
			break;
		}
		if(i==n)
			System.out.println("not found");
		else
			System.out.println(i);
		
		int key2=175;
		for(i=0;i<n;i++)
		{
		if(arr[i]==key2)
			break;
		}
		if(i==n)
			System.out.println("-1");
		else
			System.out.println(i);
	}
}