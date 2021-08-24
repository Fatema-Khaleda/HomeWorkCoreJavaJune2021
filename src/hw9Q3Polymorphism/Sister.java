/* Create a package "hw9Q3Polymorphism" inside your HW project and execute the 
 * remaining. Read the question very carefully. 
 * Create a class Sister. Can you create several methods with the same 
 * name inside it?
 *  Give the method name ageOfSisters.
 *   As a variable, use int age1, int age2, int age3, String age4,
 *    int age5, int age6 etc in different combination.
 *    
 *     Use
 *     1/void type, 
 *     2/parameterized type, 
 *     3/return type,
 *     4/ static type, 
 *     5/ Final type method by different combinations of the above variable.
 *      
 *      Tell me what is the Method overloading. initialize all the methods 
 *      in TestFamily class. 
 *      
 *      Create another class Niece and inherit Sister.
 *       Override all the possible methods by changing logic. 
 *       If some methods are not possible to override, 
 *       please explain why by comments. 
 *       Initialize all the methods in TestFamily class.*/

package hw9Q3Polymorphism;

public class Sister {
	
	/* Can you create several methods with the same name inside it?
	 * ANS: Java allows US to write more than one method in the same class definition with the same name
	*/
	
	// default constructor
	public Sister(){
		
	}
	
	// void type method
	public void ageOfSisters(int age1, int age2, int age3, String age4, int age5, int age6) {
		int ageOfSisters1 = age1 + age2 + age3 + age5 + age6 ;
		System.out.println("Age of all Sisters is : " + ageOfSisters1);
		return;
		
	}
	
	// parameterized type method:
	public int ageOfSisters2 (int age1, int age2, int age3, int age5) {
		int ageOfSisters2 = age1 + age2 + age3 + age5;
		System.out.println("Total age of all sister from parametarized method : " + ageOfSisters2 );
		return ageOfSisters2;
		
	}
	
	// static method:
	public static int ageOfSisters3(int age1, int age2, int age3) {
		int ageOfSisters3 = (age1 + age2 + age3);
		System.out.println(" total age of all sister from static method :" + ageOfSisters3);
		return ageOfSisters3;
		
	}
	
	//final type method :
	public final int ageOfSisters4 (int age1 , int age2) {
		int ageOfSisters4 = (age1 + age2);
		System.out.println("total age of all sister from final type method :" + ageOfSisters4);
		return ageOfSisters4;
		
	}

}
