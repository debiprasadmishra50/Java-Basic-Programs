class static_non_static
{
	int x = 10;
	static int y = 20;
	public static void main(String[] args) 
	{
		//System.out.println(x); // non-static variable x cannot be referenced from a static context
		System.out.println(y); // can be accessed directly
		System.out.println("-------------------");
		static_non_static ob1 = new static_non_static(); //Object created 
		static_non_static ob2 = new static_non_static();

		System.out.println(ob1.x);
		System.out.println(ob1.y);
		System.out.println(ob2.x);
		System.out.println(ob2.y);
		System.out.println("----------");

		ob1.x = 100;
		ob1.y = 200;

		System.out.println(ob1.x);
		System.out.println(ob1.y);
		System.out.println(ob2.x);
		System.out.println(ob2.y);


	}
}

// Static variable value is shared through objects but non-static variable value is not shared
/*20
-------------------
10
20
10
20
----------
100
200
10
200