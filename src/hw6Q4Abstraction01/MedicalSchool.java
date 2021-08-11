/*d) Create an Abstract Class MedicalSchool,  

create 2 methods inside the Abstract Class -  

one is abstract and another one is non abstract name --
1/ anatomyLab 
2/biochemistryLab. 

Print something inside the non abstract or implemented method   */

package hw6Q4Abstraction01;

//Abstract Class created
public abstract class MedicalSchool {

	public abstract void anatomyLab(); // abstract method

	public void biochemistryLab() {// non-abstract method
		System.out
				.println("This print is from abstract class MedicalSchool and non-abstract method  - biochemistryLab");
	}

}
