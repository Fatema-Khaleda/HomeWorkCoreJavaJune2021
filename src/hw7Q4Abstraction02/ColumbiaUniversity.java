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

package hw7Q4Abstraction02;

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

	/*
	 * You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity.
	 * 
	 * Question: 1/how many keywords are used for the inheritance in Java for a
	 * regular Class? ans:2 keywords - extends and implements
	 * 
	 * 2/Can an regular Class inherit other Abstract Class or a regular class or
	 * interface? ans: Yes, regular Class can inherit other Abstract Class or a
	 * regular class or interface
	 * 
	 * 3/How many inheritances is possible by a regular Class? ans:An Abstract class
	 * can inherit only one abstract class or only one regular class by "extends"
	 * keyword.
	 *** 
	 * 
	 * 
	 * Use the all of above regular Classes and use the keywords to answer my
	 * questions.
	 * 
	 * You don't need to execute anything as the main method is absent.
	 */
}
