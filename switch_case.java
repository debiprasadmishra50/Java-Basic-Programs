class switch_case
{
	public static void main(String[] args) 
	{
		int x = 2;
		switch(x)	
		{
			case 1 :
			System.out.println("1");
			break;

			case 2 :
			System.out.println("2");
			break;

			case 3 :
			System.out.println("3");
			break;

			// No need to write default, wont show any errors
			default :
			System.out.println("bye");
		}
	}
}