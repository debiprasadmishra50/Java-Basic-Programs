class leap_year_cmd
{
	public static void main(String[] args) 
	{

		int yr = Integer.parseInt(args[0]);
		if ((yr%400 == 0) || ((yr%4 == 0) && (yr%100 == 0)) )
			System.out.println(yr+" is a leap year");
		else
			System.out.println("not a leap year");


// javap java.lang.Integer


	}
}