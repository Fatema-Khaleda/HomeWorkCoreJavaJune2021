/*b) Create a class name Son, declare variable
 1/ Id,   2/grade. 
 Declare default and parameterized constructor, and implement a regular method son and declare a sysout. 

 Create a parameterized method sonInfo() which contains 2 of its variables.
  -Son extends Father (super class).  

Use super method, super keyword and show all of their use in child class.  

And initialize in a TestFamily Class.   */

package hw8Q3UseOfSuper01;

//Created a class name Son
public class Son extends Father {

	// declared variable
	public int id;
	public char grade;

	public Son() { // default constructor

		System.out.println(" This comment is from class and default constructor Son");

	}

	public Son(int id, char grade) { // parameterized constructor

		this.id = id;
		this.grade = grade;
		System.out.println("My Son ID is :  " + id + "\n His grade is :" + grade);
	}

	// implemented a regular method
	public void son() {
		System.out.println(" this comment is from class Son and regular method son");

	}

//Use super method, super keyword and show all of their use in child class. */ 

//Created a parameterized method sonInfo()
	public void sonInfo(int id, char grade) {

		this.id = id;
		this.grade = grade;
		super.father();
		// fatherInfo(String Name, int age, char sex, boolean usCitizen)
		super.fatherInfo("MD Ishaqu", 80, 'M', false);
		super.FamilyName = "Khaleda";
		System.out.println("My Son's name : " + Name + "\n He is : " + age + " years old." + "\n His id number is: "
				+ id + "\n His gread is: " + grade);
	}

}
