// binary recursion using recursion
class BS1
{
	static int bsearchr(int a1[], int key, int l, int h)
	{
		if(h>=l)
		{
			int mid =l+(h-l)/2;
			if(a1[mid] == key)
				return mid;
			if(a1[mid] > key)
			return bsearchr(a1, key, l,mid-1);
			return bsearchr(a1, key, mid+1, h);
			
		}
		return -1;
		
	}
	
	public static void main(String args[])
	{
		int a1[]={11,33,55,88,99};
		int key =99;
		int x= a1.length-1;
		int res=bsearchr(a1,key,0,x);
		if(res == -1)
			System.out.println("Not Found !!!");
		else
			System.out.println("Found !!!");
		
	}
}