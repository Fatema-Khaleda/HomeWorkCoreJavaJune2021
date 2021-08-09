/* ii) You have 2 abstract class name --MedicalSchool, EngineeringSchool already.  

Create another Abstract Class NursingSchool, 

 create 2 methods inside the Abstract Class -  

one is abstract and another one is the non-abstract name --
1/ hygiene 
 2/ caring.  

Print something inside the non-abstract or implemented method.  

Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not?  

Now, answer how many keywords are used for the inheritance of Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface? 

 How many inheritances is possible by an Abstract Class? */

package hw6Q4Abstraction01;

//Abstract Class created
public abstract class NursingSchool {
	
	public abstract void hygiene(); //abstract method
	
	public void caring() { //non-abstract method
		
		System.out.println("this comment is from abstract class NursingSchool and non abstract method caring");
		
	}
	
	public NursingSchool() {//default Constructor
		
	}
	
	/* Question:
	1/ how many keywords are used for the inheritance of Abstract Class? 
	ans: 2 keywords
	 
	 2/ Can an Abstract Class inherit other Abstract Class or a regular class or interface? 
     ans: A abstract class can inherit only one regular class or only one abstract class by extends keyword but can't inherit an Interface by extends keyword 
    
     3/ How many inheritances is possible by an Abstract Class?
     ans: Only one inheritance is possible in abstract class by extends keyword but Implements keyword can inherit more than one interface.
     */
		
	}
	


