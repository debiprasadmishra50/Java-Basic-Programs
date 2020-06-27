//An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
class ArmstrongNo
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter a Number");
		int x = sc.nextInt();
		int s = 0, p, m = x;
		while(x != 0)
		{
			p = x%10;
			s = s+(p*p*p);
			x = x/10;
		}
		if(s == m)
			System.out.println(m+" is an Armstrong no");
		else
			System.out.println(m+" is NOT an Armstrong no");
		
		
	}
}


/*enter a Number
123
123 is NOT an Armstrong no

enter a Number
371
371 is an Armstrong no
*/