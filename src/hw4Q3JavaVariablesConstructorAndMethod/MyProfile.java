/*Create --- a package name "hw4Q3JavaVariablesConstructorAndMethod" 
 * in "HomeWorkCoreJavaJune2021" project. Create a Class name "MyProfile".
 *  Declare 8 types (If less than 8 type, will get zero) of primitive variable
 *   and initialize them by object under main method.
 *    Declare default constructor and initialize it (show by comments where it is initializing). 
 *    Use a method and add above declared varible to use to get a outcome in console.
 *     Print out 2 sets of data for different person (one is you, another one is your favorite person).
 *      Type as much as possible. Use \n, \t somewhere in the String.
 *       After finish writing the code, paste the code here.*/

package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {

	public String name;
	public char sex;
	public byte age;
	public int houseNumber;
	public String HouseDirection;
	public int zipCode;
	public float houseRent;
	public long annual_salary;
	public String education_level;
	public float gpa;
	public double height;
	public boolean inUSA;
	public short yearsOfLiveInUsa;

	public MyProfile() { // Declare default constructor
		System.out.println("This is my default constructor");
	}

	public void myProfile() { // Method implemented
		System.out.println(" My Name is :  " + name + "\n I am : " + sex + "\n My age is : " + age + " years"
				+ "\n My House Adress is : " + houseNumber + " " + HouseDirection + " - " + zipCode + "."
				+ "\n My Monthy House Rent is : $" + houseRent + "\n My Annual Income is : $"
				+ " My Education Qyalification is : " + education_level + "\n My GPA is : " + gpa + " \n I am " + height
				+ " inches" + "\n I live in USA : " + inUSA + "\n I am living here for " + yearsOfLiveInUsa + " years");

	}

}
