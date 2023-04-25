class Toothpast{
	
	static String name;
	static String brand;
	static int price;
	static String colour;
	static String flavor;
	static int length;
	static int width;
	static boolean salt;
	static double expdate;
	
	static void setNmae(String value)
	{
		name=value;
	} 
	static void setBrand(String value)
	{
		brand=value;
	}
	static void setPrice(int value)
	{
	price=value;
	}
	static void setColour(String value)
	{
		colour=value;
	}
	static void setFlavor(String value)
	{
	flavor=value;
	}
	static void setLenght(int value)
	{
	length=value;
	}
	static void setWidth(int value)
	{
		width=value;
	}
	static void setSalt(boolean value)
	{
		salt=value;
	}
	static void setExpdate(double value)
	
	{
		expdate=value;
	}
	
	/*static String name;
	static String brand;
	static int price;
	static String colour;
	static String flavor;
	static int length;
	static int width;
	static boolean salt;
	static double expdate;*/
	
	
	static String getName()
	{
		System.out.println("name :"+name);
		return name;
	}
	static String getBrand()
	{
		System.out.println("brand :"+brand);
		return brand;
	}
	static int getPrice()
	{
		System.out.println("price :"+price);
		return price;
	}
	static  String getColour()
	{
		System.out.println("colour :"+colour);
	return colour;
	}
	static  String getFlavor()
	{
		System.out.println("flavor :"+flavor);
		return flavor;
	}
	static int getLenght()
	{
		System.out.println("length :"+length);
	return length;
	}
	static int getWidth()
	{
		System.out.println("width :"+width);
		return width;
	}
	static boolean getSalt()
	{
		System.out.println("salt :"+salt);
		return salt;
	}
	static double getExpdate()
	{
		System.out.println("expdate :"+expdate);
		return expdate;
	}
}