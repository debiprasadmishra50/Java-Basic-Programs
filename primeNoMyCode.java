class primeNoMyCode
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter a Number");
		int x = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= x/2; i++) 
		{
			if(x%i == 0)
				cnt++;
		}	
		if (cnt == 1)
			System.out.println(x+" is a prime no");
		else
			System.out.println(x+" is NOT a prime no");
	}
}