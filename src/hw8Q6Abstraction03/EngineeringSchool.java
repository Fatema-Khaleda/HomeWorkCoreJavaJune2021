/* e) Create another Abstract Class EngineeringSchool, 

 create 2 methods inside the Abstract Class  

one is abstract and another one is non abstract name -- 
1/mechanicalLab 
2/ computerLab.  

Print something inside the non abstract or implemented method .  */

package hw8Q6Abstraction03;

//abstract class created
public abstract class EngineeringSchool extends NYUniversity {

	public abstract void mechanicalLab(); // abstract methods

	public void computerLab() {// non-abstract methods
		System.out.println(
				" this comments is from abstract class \"EngineeringSchool\" and non abstact mechod computerLab ");

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
