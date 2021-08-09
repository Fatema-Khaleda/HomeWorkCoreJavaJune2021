/* e) Create another Abstract Class EngineeringSchool, 

 create 2 methods inside the Abstract Class  

one is abstract and another one is non abstract name -- 
1/mechanicalLab 
2/ computerLab.  

Print something inside the non abstract or implemented method .  */

package hw6Q4Abstraction01;
//abstract class created
public abstract class EngineeringSchool {
	
	public abstract void mechanicalLab(); // abstract methods
	
	public void computerLab() {// non-abstract methods
		System.out.println(" this comments is from abstract class \"EngineeringSchool\" and non abstact mechod computerLab ");
		
	}
}
