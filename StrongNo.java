//Strong numbers are the numbers whose sum of factorial of digits is equal to the original number

class StrongNo
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter a Number");
		int x = sc.nextInt();
		int s = 0, p,fa = 1, m = x;
		while(x != 0)
		{
			p = x%10;

			while(p != 0)
			{
				fa = fa*p;
				p--;
			}
			
			s = s+fa;
			x = x/10;
			fa = 1;
		}
		
		if(s == m)
			System.out.println(m+" is a Strong no");
		else
			System.out.println(m+" is NOT a Strong no");

	}
}

/*enter a Number
145
145
145 is a Strong no
*/