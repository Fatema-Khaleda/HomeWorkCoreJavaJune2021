/*iv) Create a regular Class NYUniversity,  

create 2 methods inside the class - one is abstract and another one is non-abstract name --
1/ anthropology 
2/ physics.  

if not possible to create, simply comment out the method and explain why in comment out. 
Print something inside the non-abstract or implemented method.  

Can you create a Constructor inside a regular Class? 
If yes, create default Constructor. 
If no, comment out the created constructor and answer why not?*/

package hw7Q4Abstraction02;

public class NYUniversity {

	/*
	 * public abstract void anthropology();//abstract method we can not create
	 * abstract class in regular class. we can create abstract method only in
	 * abstract class
	 */

	public void physics() { // non-abstract method

		System.out.println("this comment is from regular class NYUniversity and regular method physics");
	}

	public NYUniversity() { // default Constructor

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
	 */

}
