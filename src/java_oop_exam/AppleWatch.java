/* 03) Assume AppleWatch is an abstract class which has 2 method: 
 * One is abstractClassInfo [which is a non-abstract
 *  method, print out all the features of an abstract class 
 *  compared with Interface, regular class]. 
 *  
 *  what type of method would be the other one - name appleWatchInfo?
 *   Can you create a constructor inside Abstract Class? 
 *   
 *   Create two interface names Watch, DigitalWatch.
 *    And a regular class name AppleWatchSeries5. 
 *    Can you make a relationship with AppleWatch, Watch, 
 *    DigitalWatch, and AppleWatchSeries5? [points: 70] .
*/

package java_oop_exam;

public abstract class AppleWatch implements Watch, DigitaWatch{
	
	public AppleWatch() { // constructor
		System.out.println(" qus 1: Can you create a constructor inside Abstract Class?"
	+" yes, this comment is from constructor of Abstract class Applewatch");
	}
	
	public void abstractClassInfo() { //non-abstract method
		System.out.println(" qus 2: all the features of an abstract class compared with Interface, regular class \n " 
	+ " ans: 1/ Abstract class can not be instantiated \n" 
				+ "2/ Can inherit only one regular class or abstract class \n"
	 + "3/ can't inherit an Interface ");
	}
	
	public abstract void appleWatchInfo(); // abstract method

}
