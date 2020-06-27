class PrimeNoTimeComplexicity
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter a Number");
		int x = sc.nextInt();
		int cnt = 0;
		for (int i = 2; i <= x/i; i++) 
		{
			if (x%i == 0)	
			{
				cnt++;
				break;
			}
		}
		if (cnt == 0)
			System.out.println(x+" is a prime number");
		else
			System.out.println(x+" is NOT a prime number");


	}
}