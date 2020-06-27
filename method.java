class method
{ 
	java.util.Scanner sc = new java.util.Scanner(System.in);
	void display()
	{
		System.out.println("Hello");
	}

	int getsum()
	{
		System.out.println("enter 2 numbers");
		int x = sc.nextInt();
		int y = sc.nextInt(),sum;
		System.out.println(sum = x+y);
		return sum;
	}
	public static void main(String[] args) 
	{
		new method().display();	
		method me = new method();
		me.display();
		//display(); non-static method display() cannot be referenced from a static context
		me.show();
		me.getsum();
	}
	void show()
	{
		System.out.println("Hiiiiiiiiii");
	}
}

/*Hello
Hello
Hiiiiiiiiii
enter 2 numbers
2
2
4
