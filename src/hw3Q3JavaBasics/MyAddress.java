/* Create --- a package name "hw3Q3JavaBasics" in "HomeWorkCoreJavaJune2021" project.
 *  Create a Class name "MyAddress".
 *   Use different types of variable to implement your address in console.
 *   Type as much as possible. After finish writing the code, paste the code here. */


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
