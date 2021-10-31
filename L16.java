class L16
{
	public static void main(String args[])
	{
	for(int i=1;i<=8;i++){
		for(int j=1;j<=5;j++){
		{
		if((i==1&&(j==1||j==5)))
		System.out.print("+");
		else 
		System.out.print(" ");
		if(i==1&&(j==2||j==3||j==4))
		System.out.print("''");
		else 
		System.out.print(" ");
		}
	    
		{
		if(i==3&&(j==1||j==5))
		System.out.print("|");
		else 
		System.out.print(" ");
		if(i==3&&(j==2||j==4))
		System.out.print("O");
		else 
		System.out.print(" ");
		}
		
		{
		if(i==4&&j==3)
		System.out.print("^");
		else 
		System.out.print(" ");
		}
		
		{
		if(i==5&&(j==1||j==5))
		System.out.print("|");
		else 
		System.out.print(" ");
		}
		
		{
		if(i==6&&(j==2||j==4))
		System.out.print("''");
		else 
		System.out.print(" ");
		}
		
		{
		if(i==7&&(j==1||j==5))
		System.out.print("|");
		else 
		System.out.print(" ");
		if(i==7&&j==3)
		System.out.print("_");
		else 
		System.out.print(" ");
		}
		
		{
		if(i==8&&(j==1||j==5))
		System.out.print("+");
		else 
		System.out.print(" ");
		if(i==8&&(j==2||j==3||j==4))
		System.out.print("_");
		else 
		System.out.print(" ");
		}
		}
		
	}
	System.out.println(" ");
	}
}