class   SubmarinesRunner{
	
	public static void main(String[] navy){
		
		System.out.println("Main: Submarines");
		
		Submarines.printDetails();
		
		Submarines.name = "Inskalvari";
		Submarines.hight = 123;
		Submarines.waight = 13500;
		Submarines.countrie = "India";
		Submarines.shap = "Cylindrical";
		
		String[] ref = {"wight","block"};
		Submarines.colours = ref;
		Submarines.printDetails();
	}
	
	
	
}