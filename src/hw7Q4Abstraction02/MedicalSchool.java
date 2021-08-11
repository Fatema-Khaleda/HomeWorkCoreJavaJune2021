/*d) Create an Abstract Class MedicalSchool,  

create 2 methods inside the Abstract Class -  

one is abstract and another one is non abstract name --
1/ anatomyLab 
2/biochemistryLab. 

Print something inside the non abstract or implemented method   */

package hw7Q4Abstraction02;

//Abstract Class created
public abstract class MedicalSchool {

	public abstract void anatomyLab(); // abstract method

	public void biochemistryLab() {// non-abstract method
		System.out
				.println("This print is from abstract class MedicalSchool and non-abstract method  - biochemistryLab");
	}

	/*
	 * You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
	 * NursingSchool.
	 * 
	 * Question: 1/how many keywords are used for the inheritance in Java for
	 * Abstract Class? ans: 2 keyword - extends and implements
	 * 
	 * 2/Can an Abstract Class inherit other Abstract Class or a regular class or
	 * interface? ans:Yes, Abstract Class can inherit other Abstract Class or a
	 * regular class or interface
	 * 
	 * 3/How many inheritances is possible by an Abstract Class? ans:An Abstract
	 * class can inherit only one abstract class or only one regular class by
	 * "extends" keyword.
	 ** 
	 * Use the all of above Abstract Classes and use the keywords to answer my
	 * questions.
	 */

}
