/*Create a package 'java_oop_exam' (The code needs to prepare according to the question):
 *  Phone is an interface that has four abstract method
 *   interfaceInfo,call, message, camera and 
 *  2 non-abstract method - battery and wireless which are implemented. 
 *  from this 2 method -- print out what type of method they are. 
 *  [for example -- "battery is a ...... method from Java ....."].
 *  
 * When you get a chance to implement interfaceInfo, print out 
 * answers for the following questions:
 * [What are the features of Interface you know?
 * Can we create a constructor inside an interface? Can we write variables inside Interface? Don't copy-paste, write how much you can remember, use newline (\n), tab(\t)], for other abstract methods which will be implemented, also print whatever you like. Do you think we can extends or implements Interface? Single or multiple? Create two interface Pager and Wakitaki (Phone interface inherit them) and One regular class name LandPhone and one abstract class SatelitePhone. make a relation of this 4, with Phone if possible. [points: 70] . */

package java_oop_exam;

public interface Phone {
	
	public abstract void interfaceInfo();
	
	public abstract void call();
	
	public abstract void message();
	
	public abstract void camera();
	
	public default void battery() {
		System.out.println(" Battery method is a non-abstract method from default void inside intercace Pnone");
	}
	
	public static void wireless () {
		System.out.println(" Wireless method is from non-abstract method from static method inside intercace Pnone ");
		
		System.out.println("Qustion 1: What are the features of Interface you know?\n"
		+ "Ans: "
				+ " 1/ Interface Methods might contain abstract keyword or not \n"
				+ " 2/ Generally Methods declared inside it \n"
				+ " 3/ Name starts with uppercase \n"
				+ " 4/ Interface is Blueprint of class  ");
		
		System.out.println("Qustion 2: Can we create a constructor inside an interface? \n" + 
		"Ans: No, we can not ");
	
		System.out.println("Question 3: Can we write variables inside Interface? "
				+ "Ans: Interface dosen't allow us to deaclare any intance variables ");
		
		System.out.println("Qustion 4: Do you think we can extends or implements Interface? Single or multiple? \n" + 
		"Ans:Multiple inheritance is not allowed. Interfaces are not classes, but, if an interface can extend"
		+ " more than one parent interface. The extends keyword is used once, and the parent interfaces are "
		+ "declared in a comma-separated list.  ");
	}
	
	

}
