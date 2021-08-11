/* b) Create another interface "Hospital". Declare some methods inside the interface -  

-emergencyRoom,  

-surgeryRoom,  

-cafeteria.  */

package hw7Q4Abstraction02;

//interface created
public interface Hospital {

	// method declare :

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	/*
	 * Question: i) Can you create a Constructor inside the interface? If yes,
	 * create default Constructor on each interface. If no, comment out the 'created
	 * constructor' and answer why not?
	 */

	// Answer:
	// public Hospital(); // default constructor created
	/*
	 * we can not create a Constructor inside the interface. it shows erorr. because
	 * Interface can not have constructor
	 */

	/*
	 * B) Create one default and one static method morgue and pharmacy inside
	 * interface "Hospital".
	 */

	public default void morgue() { // defult method

	}

	public static void phermacy() { // static method

	}

	/*
	 * Questions: 1/How many keywords are used for the inheritance in Java? Answer:
	 * 2 keywords - extends and implements
	 * 
	 * 2/ How many keywords are used for the inheritance in Interface, answer by
	 * Java comments? Answer: 2 keyword - extends
	 ** 
	 * If you can use the keyword 'implements' in Interface, please use it. Use all
	 * the interfaces -- University, Hospital, and College to answer my questions
	 */

}
