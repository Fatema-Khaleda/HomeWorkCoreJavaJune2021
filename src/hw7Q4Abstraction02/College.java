/* c) Create another interface "College". Declare some methods inside the interface -  

-commonRoom,  

-laboratory, 

- languageClub. */

package hw7Q4Abstraction02;

// interface created
public interface College {

	// methods declare :

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	/*
	 * Question: i) Can you create a Constructor inside the interface? If yes,
	 * create default Constructor on each interface. If no, comment out the 'created
	 * constructor' and answer why not?
	 */

	// Answer:
	// public College(); // default constructor created
	/*
	 * we can not create a Constructor inside the interface. it shows erorr. because
	 * Interface can not have constructor
	 */

	// Create also one default and one static method dorm and studyRoom inside
	// interface "College"

	public default void dorm() { // default method

	}

	public static void studyRoom() { // static method

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
