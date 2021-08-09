/* Create a package name "hw7Q3Encapsulation01" in the HW project.
  Inside the package,
  a) Create a class, Employee.
  
 declare some private variable----> 
 1/Name, 
 2/age, 
 3/sex,
 4/ usCitizen.
 
 How can you access those variables by getter and setter method?
 Please execute those variables and print Employee info. Paste the GitHub link below.*/

package hw7Q3Encapsulation01;

//class created
public class Employee {
	
	//declare some private variable:
	
	private String Name;
	private int age;
	private char sex;
	private boolean usCitizen;
	
	public String getName() { //getter method
		return Name;
	}
	
	public void setName(String name) { //setter method
		this.Name = name;
	}
	 
	public int getAge() {//getter method
		return age;
	}
	
	public void setAge( int age) {//setter method
		this.age = age;
	}
	
	public char getSex () {//getter method
		return sex;
	}
	
	public void setSex(char sex) {//setter method
		this.sex = sex;
	}
	
	public boolean isUsCitizen() {//getter method
		return usCitizen;
	}
	
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
	

}
