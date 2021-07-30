package hw3Q3JavaBasics;

public class MyAddress {
	
	static String MyName = "Fatema Khaleda";
	static int houseNumber = 524;
	static String HouseDirection = "Mcdonald Ave";
	static String cityName = "Brooklyn";
	static String stateName = "New York";
	static int zipCode = 11218;
	static boolean inUSA = true;
	
	

	public static void myAddress() {
		
		System.out.println(MyName + "\n" +houseNumber + " " + HouseDirection + ", " + cityName + "\n" +stateName +", " + zipCode + "\n" );
		System.out.println("Is this Address inside USA?" + "\n" + inUSA);

		

	}
	public static void main(String[] args) {
		myAddress();
		
	}

}
