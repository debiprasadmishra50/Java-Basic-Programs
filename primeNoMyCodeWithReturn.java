class primeNoMyCodeWithReturn
{
	static boolean checkPrime(int num)
	{
		int cnt = 0;
		for (int i = 2; i <= num/i; i++) 
		{
			if(num%i == 0)
				cnt++;
			return false;
		}	
		return true;
	}
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner (System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt ();	

		boolean result = checkPrime (a);
		if(result == true)
			System.out.println(a+" is Prime");
		else
			System.out.println(a+" is NOT Prime");
	}

}