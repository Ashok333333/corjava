class  Card{
	
	static String Name;
	static int hight;
	static int waight;
	static double price;
	static String[] colours;
	
	static void printDetails()
	{
		System.out.println(Name);
		System.out.println(hight);
		System.out.println(waight);		
		System.out.println(price);
		if(colours!=null)
		{
			System.out.println("pointing to memory");
			for(int A=0; A<colours.length; A++)
			{
				String ref = colours[A];
				System.out.println(ref);
			}
		}
		else{
			System.out.println("not pointing to memory");
		}
	}
	
	
	
	
}