/* Tell me what is the Method overloading. initialize all the methods 
 *      in TestFamily class. 
 *      
 *      Create another class Niece and inherit Sister.
 *       Override all the possible methods by changing logic. 
 *       If some methods are not possible to override, 
 *       please explain why by comments. 
 *       Initialize all the methods in TestFamily class.*/

package hw9Q3Polymorphism;

public class TestFamily {
	public static void main(String[] args){
		Sister sister = new Sister();
		sister.ageOfSisters(50, 45, 40, "35", 30, 25);
		sister.ageOfSisters2(50, 45, 40, 30);
		sister.ageOfSisters3(50, 45, 40);
		sister.ageOfSisters4(50, 45);
		
		
		
	}

}
