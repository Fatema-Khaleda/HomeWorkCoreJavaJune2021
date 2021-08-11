/*iii) Create a regular Class ColumbiaUniversity,  

create 2 methods inside the class -  

one is abstract and another one is the non-abstract name -- 
1/chemistry 
2/ biology.  

if any of them is not possible to create, simply comment out the method and explain why in comment out.
 Print something inside the non-abstract or implemented method.  

Can you create a Constructor inside a regular Class? 
If yes, create default Constructor. 
If no, comment out the created constructor and answer why not?   */

package hw6Q4Abstraction01;

public class ColumbiaUniversity {

	/*
	 * public abstract void chemistry(); //abstract method we can not create
	 * abstract class in regular class. we can create abstract method only in
	 * abstract class
	 */

	public void biology() { // non-abstract method
		System.out.println(" this comment is from regular class ColumbiaUniversity and regular method");
	}

	public ColumbiaUniversity() { // default Constructor created
		System.out.println("this comment is from regular class ColumbiaUniversity, and default Constructor");
	}
}
