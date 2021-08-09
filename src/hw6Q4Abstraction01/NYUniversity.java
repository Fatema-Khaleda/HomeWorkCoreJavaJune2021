/*iv) Create a regular Class NYUniversity,  

create 2 methods inside the class - one is abstract and another one is non-abstract name --
1/ anthropology 
2/ physics.  

if not possible to create, simply comment out the method and explain why in comment out. 
Print something inside the non-abstract or implemented method.  

Can you create a Constructor inside a regular Class? 
If yes, create default Constructor. 
If no, comment out the created constructor and answer why not?*/

package hw6Q4Abstraction01;

public class NYUniversity {

	/*
	public abstract void anthropology();//abstract method
		we can not create abstract class in regular class. we can create abstract method only in abstract class
		*/
	
	public void physics() { //non-abstract method
		
		System.out.println("this comment is from regular class NYUniversity and regular method physics");
	}
	
	public NYUniversity() { //default Constructor
		
	}
	

}
