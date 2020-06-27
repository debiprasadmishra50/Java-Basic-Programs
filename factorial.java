class factorial
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter a Number");
		int x = sc.nextInt();
		int fc = 1;
		while(x != 0)	
		{
			fc = fc*x;
			x--;
		}
		System.out.println(fc);

		
	}
}