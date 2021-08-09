/* Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char).
 *  Declare default constructor and multiple parameterized constructor. 
 *  Use only one System.out.println() in each constructor. b) Create another class TestComputer.
 *   Create object as many as you want under main method. Initialize all the constructors.
 *    I want in console, the first outcome as --> This is from default Constructor of Computer class. 
 *    Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, 
 *    Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your 
 *    configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable */
package hw5Q4Constructor;

public class Computer {
	
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUsa;
	public char grade;
	
	public Computer() { //Declare default constructor
		System.out.println(" This in my Default constructor");
	}
	
	public Computer(String Brand, String Model, String OperatingSystem, int price, boolean madeInUsa, char grade) {
		this.Brand = Brand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.madeInUsa = madeInUsa;
		this.grade = grade;
		System.out.println(" My Brand : " + Brand + "\n Model: " + Model + "\n Operating system: " +
				OperatingSystem +"\n Price : $" + price + "\n Made in USA :" + madeInUsa + "\n Grade : " + grade);
				
}
	
	public Computer(String Brand) {
		this.Brand = Brand;
		System.out.println("My Computer Brand Name is: "+ Brand);
	}
	
	public Computer(String Brand, String Model, String OperatingSystem ) {
		this.Brand = Brand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		System.out.println(" My Brand : " + Brand + "\n Model: " + Model + "\n Operating system: " +
				OperatingSystem);
	}
	
	public Computer(String Brand, String Model, String OperatingSystem, int price, boolean madeInUsa) {
		this.Brand = Brand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.madeInUsa = madeInUsa;
		System.out.println(" My Brand : " + Brand + "\n Model: " + Model + "\n Operating system: " +
				OperatingSystem +"\n Price : $" + price + "\n Made in USA :" + madeInUsa);
	}
}
