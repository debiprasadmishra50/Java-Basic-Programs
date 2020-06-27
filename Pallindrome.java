class Pallindrome
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter a Number");
		int x = sc.nextInt();
		int s = 0, p,m = x;
		while(x != 0)	
		{
			p = x%10;
			s = s*10 + p;
			x = x/10;
		}
		
		if (s == m)
			System.out.println(m+" is a Pallindrome");
		else
			System.out.println(m+" is NOT a Pallindrome");
	}
}