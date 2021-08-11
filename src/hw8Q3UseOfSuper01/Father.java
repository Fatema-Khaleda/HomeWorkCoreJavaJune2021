/* Create a package name "hw8Q3UseOfSuper01" in the HW project. 

 Inside the package,  

a) Create a class name Father. declare some variable like  

1/Name,  2/age,  3/sex,  4/usCitizen,  5/FamilyName. 

 Declare default and parameterized constructor from the first 4 variables. 

 Use FamilyName variable for use by super keyword.  

Create a regular void method father() which is implemented, declare a sysout.  

Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout  */

package hw8Q3UseOfSuper01;

//Create a class name Father
public class Father {
	// declared some variable
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;

	public Father() { // default constructor
		System.out.println("This comment is from class and default constructor Father");

	}

	// parameterized constructor
	public Father(String Name, int age, char sex, boolean usCitizen) {
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(
				" My Father's Name  is : " + Name + "\n His Age: " + age + "\n Sex: " + sex + "\n Is he USA Citizen");

	}

	// Created a regular void method father() which is implemented, declare a
	// sysout.
	public void father() {
		System.out
				.println(" This comment is from regular void method father() which is implemented, declare in sysout");
	}

	// Created a parameterized method fatherInfo which also contain it's 4
	// variables, declared a sysout
	public void fatherInfo(String Name, int age, char sex, boolean usCitizen) {
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(" Name : " + Name + "\n Age: " + age + "\n Sex: " + sex + "\n Is he USA Citizen?");
	}
}
