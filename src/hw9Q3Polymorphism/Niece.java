/* Create another class Niece and inherit Sister.
 *       Override all the possible methods by changing logic. 
 *       If some methods are not possible to override, 
 *       please explain why by comments. 
 *       Initialize all the methods in TestFamily class.*/


package hw9Q3Polymorphism;

public class Niece extends Sister{

	@Override
	public void ageOfSisters(int age1, int age2, int age3, String age4, int age5, int age6) {
		// TODO Auto-generated method stub
		super.ageOfSisters(age1, age2, age3, age4, age5, age6);
	}

	@Override
	public int ageOfSisters2(int age1, int age2, int age3, int age5) {
		// TODO Auto-generated method stub
		return super.ageOfSisters2(age1, age2, age3, age5);
	}


	
/*  Qustion :Override all the possible methods by changing logic. 
 *       If some methods are not possible to override, 
 *       please explain why by comments. 
 *       
 *  Ans: Final type method can not be over written.
 *  */

	
}
