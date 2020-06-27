class operator
{
	public static void main(String[] args) 
	{
		int x = 4;
		int z = 4;
		int y, y1;
		y = ++x + ++x + ++x + ++x;	//5+6+7+8
		y1 = ++z + ++z + z++ + z++;	//5+6+6+7
		
		System.out.println(y+"\t"+y1);
	}
}