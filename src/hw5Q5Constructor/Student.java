/*  Declare some variable -- StName, stID, sex, programmer(as boolean), grade (as float). 
 * Declare default constructor and one parameterized constructors. Use only one System.out.println() in each constructor
 *  to declare the above variables. Also, create a parameterized method with all the variables. Create another class TestStudent.
 *   Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console 
 *   as --> This is from default Constructor of Student class. The second outcome -- > Student Name: <your name>, 
 *   ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer: true. 
 *   Also, initialize the parameterized method.*/

package hw5Q5Constructor;

public class Student {
	 
	public String stNameString;
	public int stId ;
	public char sex;
	public boolean programmer;
	public float grade;
	
	public Student() {  //  declare default constructor
		System.out.println("This is my default constructor of Student class");
	}
	
	// declare parameterized constructors
	public Student(String stNameString, int stId ,  char sex,  boolean programmer,  float grade ) {
		this.stNameString = stNameString;
		this.stId = stId;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;
		 System.out.println("Student Name is : "+ stNameString+ "\n Student Id Number is : " + stId + "\n Student sex is : " +
		sex + "\n This Studend is a Programer : " + programmer + "\n This student grade is : " + grade);
	}
	
	}


