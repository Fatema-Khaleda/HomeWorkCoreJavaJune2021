/*a) Create an interface "University". Declare some methods inside the interface named-->          
 -classSize,  

-field,  

- teacher.  */

package hw6Q4Abstraction01;

//This is an interface
public interface University {

	// methods Declare :

	public void classSize();

	public void field();

	public void teacher();

	/*
	 * Use the Interface -- "University" to answer my questions
	 * 
	 * Question 1/: i) Can you create a Constructor inside the interface? If yes,
	 * create default Constructor on each interface. If no, comment out the 'created
	 * constructor' and answer why not? Answer:
	 * 
	 * public University(); // default constructor created
	 * 
	 * we can not create a Constructor inside the interface. it shows erorr. because
	 * Interface can not have constructor
	 * 
	 * 
	 * Question 2/ answer how many keywords are used for the inheritance for
	 * Interface? Answer: only 1 keywords are used for the inheritance for
	 * Interface.
	 * 
	 * Question 3/ Can an interface inherit other Interface, or a regular class or
	 * abstract class? Answer: Yes- an interface inherit other Interface, but it can
	 * not inherit a regular class or abstract class.
	 * 
	 * Question 4/ How many inheritance is possible? Answer: More than one
	 * interfaces can inherit by an interface by extends keywords.
	 * 
	 * 
	 */

}
