class ReverseANo
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter a Number");
		int x = sc.nextInt();
		int s = 0, p;
		while(x != 0)	
		{
			p = x%10;
			s = s*10 + p;
			x = x/10;
		}
		System.out.println(s);
	}
}