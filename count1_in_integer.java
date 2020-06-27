class count1_in_integer
{
	public static void main(String[] args) 
	{
		int c= 0;
		int x = 10;
		while(x > 0)
		{
		c++;
		x = x & x-1;	
		}
		
		System.out.println(c);	
	}
}