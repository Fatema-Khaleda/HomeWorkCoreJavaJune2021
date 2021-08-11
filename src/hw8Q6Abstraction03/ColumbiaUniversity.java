/*iii) Create a regular Class ColumbiaUniversity,  

create 2 methods inside the class -  

one is abstract and another one is the non-abstract name -- 
1/chemistry 
2/ biology.  

if any of them is not possible to create, simply comment out the method and explain why in comment out.
 Print something inside the non-abstract or implemented method.  

Can you create a Constructor inside a regular Class? 
If yes, create default Constructor. 
If no, comment out the created constructor and answer why not?   

**ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. 
. */

package hw8Q6Abstraction03;

import hw6Q4Abstraction01.University;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	/*
	 * public abstract void chemistry(); //abstract method We can not create
	 * abstract class in regular class. we can create abstract method only in
	 * abstract class
	 */

	public ColumbiaUniversity() { // default Constructor created
		System.out.println("this comment is from regular class ColumbiaUniversity, and default Constructor");
	}

	public void biology() { // non-abstract method
		System.out.println(" this comment is from regular class ColumbiaUniversity and regular method");
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void field() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void biochemistryLab() {
		// TODO Auto-generated method stub
		super.biochemistryLab();
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void caring() {
		// TODO Auto-generated method stub
		super.caring();
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
	 * keyword
	 *** 
	 * Use the all of above regular Classes and use the keywords to answer my
	 * questions. You don't need to execute anything as the main method is absent.
	 */

}
