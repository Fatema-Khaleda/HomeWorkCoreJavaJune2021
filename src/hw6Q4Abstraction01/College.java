/* c) Create another interface "College". Declare some methods inside the interface -  

-commonRoom,  

-laboratory, 

- languageClub. */

package hw6Q4Abstraction01;

// interface created
public interface College {
	
	// methods declare :
	
	public void commonRoom();
	
	public void laboratory();
	
	public void languageClub();
	
	/* Question:
	  i) Can you create a Constructor inside the interface? 
	  If yes, create default Constructor on each interface.
	  If no, comment out the 'created constructor' and answer why not? */
	
	// Answer:
	//public College();     // default constructor created
	/*
	we can not create  a Constructor inside the interface. it shows erorr.
	because Interface can not have constructor
	*/

}
