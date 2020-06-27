class ObNClass
{
	int id;
	String name;
	public static void main(String[] args) 
	{
		/*id = 100;
		System.out.println(id);	// ERROR
		 non-static variable id cannot be referenced from a static context*/

		 ObNClass s1 = new ObNClass();
		 ObNClass s2 = new ObNClass();

		 s1.id = 100;
		 s1.name = "Devi";

		 s2.id = 200;
		 s2.name = "Alpu";

		 System.out.println(s1.id+" "+s1.name);
		 System.out.println(s2.id+" "+s2.name);
	}
}