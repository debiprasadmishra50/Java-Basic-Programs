class swapping
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter 2 Number");
		int x = sc.nextInt();
		int y = sc.nextInt();

		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After Swapping  "+x+"\t"+y);	
	}
}