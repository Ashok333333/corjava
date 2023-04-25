class Submarines{
	
	static String name;
	static int hight;
	static double waight;
	static String countrie;
	static String shap;
	static  String[] colours;
	
	static void printDetails() 
	{
	
	System.out.println(name);
	System.out.println(hight);
	System.out.println(waight);	
	System.out.println(countrie);
	System.out.println(shap);	
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