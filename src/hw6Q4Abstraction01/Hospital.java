/* b) Create another interface "Hospital". Declare some methods inside the interface -  

-emergencyRoom,  

-surgeryRoom,  

-cafeteria.  */

package hw6Q4Abstraction01;

//interface created
public interface Hospital {
	
	//method declare :
	
	public void emergencyRoom();
	
	public void surgeryRoom();
	
	public void cafeteria();

	/* Question:
	  i) Can you create a Constructor inside the interface? 
	  If yes, create default Constructor on each interface.
	  If no, comment out the 'created constructor' and answer why not? */
	
	// Answer:
	//public Hospital();     // default constructor created
	/*
	we can not create  a Constructor inside the interface. it shows erorr.
	because Interface can not have constructor
	*/

}
