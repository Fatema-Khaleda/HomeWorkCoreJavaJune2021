/* Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console 
 *   as --> This is from default Constructor of Student class. The second outcome -- > Student Name: <your name>, 
 *   ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer: true. 
 *   Also, initialize the parameterized method.*/

package hw5Q5Constructor;


public class TestStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		System.out.println("______________________________________________________");
		
		Student myInfo = new Student("Fatema Khaleda", 2021022, 'F', true, 3.976f);
		System.out.println("______________________________________________________");
		
		Student nayon = new Student("Nayon", 2021023, 'M', true, 4.00f);
		System.out.println("______________________________________________________");
		
		Student shakir = new Student("Shakir", 20210201, 'M', true, 4.00f);
		System.out.println("______________________________________________________");
		
		Student Ray = new Student("Rayhan", 20210202, 'M', true, 4.00f);
		System.out.println("______________________________________________________");
		
	}

}
