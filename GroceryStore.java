class GroceryStore{
	
	static String place;
	static String name;
	static String iteams;
	static byte price;
	static boolean queality;
	static short totalcost;
	static float range;
	static int width;
	static int length;
	static double expdate;
	static String vegetables;
	static String brand;
	
	static void setPlace(String value)
	{
		place=value;
	}
	static void setName(String value)
	{
		name=value;
	}
	static void setIteams(String value)
	{
		iteams=value;
	}
	static void setPrice(byte value)
	{
		price=value;
	}
	static void setQueality(boolean value)
	{
		queality=value;
	}
	static void setTotalcost(short value)
	{
		totalcost=value;
	}
	static void setRange(float value)
	{
		range=value;
	}
	static void setLength(int value)
	{
		length=value;
	}
	static void setExpdate(double value)
	{
		expdate=value;
	}
	static void setVegetables(String value)
	{
		vegetables=value;
	}
	static void setBrand(String value)
	{
		brand=value;
	}
	
	
	/*static String place;
	static String name;
	static String iteam;
	static byte price;
	static boolean queality;
	static short totalcost;
	static float range;
	static int width;
	static int length;
	static double expdate;
	static String vegitabels;
	static String brand;*/
	
	
	
	static String getPlace()
	{
		System.out.println("place :"+place);
		return place;
	}
	static String getName()
	{
		System.out.println("name:"+name);
		return name;
	}
	static String getIteams()
	{
		System.out.println("iteams :"+iteams);
		return iteams;
	}
	static  byte getPrice()
	{
		System.out.println("price :"+price);
	    return price;
	}
	static  boolean getQueality()
	{
		System.out.println("queality :"+queality);
		return queality;
	}
	static short getTotalcost()
	{
		System.out.println("totalcost :"+totalcost);
	    return totalcost;
	}
    static float getRange()
	{
		System.out.println("range :"+range);
		return range;
	}
	 static int getWidth()
	{
		System.out.println("width :"+width);
		return width;
	}
	static int getLength()
	{
		System.out.println("length :"+length);
		return length;
	}
	
	static double getExpdate()
	{
		System.out.println("expdate :"+expdate);
		return expdate;
	}
	static String getVegetables()
	{
		System.out.println("vegetables :"+vegetables);
		return vegetables;
	}
	static String getBrand()
	{
		System.out.println("brand :"+brand);
		return brand;
	}
	
	
}