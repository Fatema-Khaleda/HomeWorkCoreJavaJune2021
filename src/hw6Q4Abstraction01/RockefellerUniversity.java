/* v) Create a regular Class RockefellerUniversity,  

create 2 methods inside the class -  

one is abstract and another one is the non-abstract name –
1/ maths and 2/statistics. 

 if not possible to create, simply comment out the method and explain why in comment out.
  Print something inside the non-abstract or implemented method.  

Can you create a Constructor inside a regular Class?
 If yes, create default Constructor. 
 If no, comment out the created constructor and answer why not?  

Now, answer how many keywords are used for the inheritance for a regular Class?  

Can a regular Class inherit other Abstract Class or regular class or interface?  

How many inheritances is possible by a regular Class?  

Use the above regular Classes to answer my questions.  */

package hw6Q4Abstraction01;
//regular Class created
public class RockefellerUniversity {
	
	/*
	public abstract void maths() ;/abstract method
		we can not create abstract class in regular class. we can create abstract method only in abstract class
*/
	
	public void statistics() {
		System.out.println("this comment is from regular class RockefellerUniversity and regular method statistics");
	}
	
	/* Questions:
	 1/how many keywords are used for the inheritance for a regular Class?  
	 ans:2 extend and implements
	 
	 2/Can a regular Class inherit other Abstract Class or regular class or interface?  
	 ans: YES, Only one abstract or regular class.
	 
	 3/How many inheritances is possible by a regular Class?
	 ans:Only one abstract or regular class and multiple Interface.
	   */
	
	
	
	
}
