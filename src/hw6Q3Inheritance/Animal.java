/*Create a package name "hw6Q3Inheritance" in HW project. Inside the package, 
a) Create a class "Animal". Implement a method inside the class -- animalInfo and System.out.println("This method 
is from Animal Class"). 
b) Create another class "Mammal". Implement a method inside the class -- mammalInfo and System.out.println
("This method is from Mammal Class"). 
c) Create another class "Reptile". Implement a method inside the class -- reptileInfo and System.out.println
("This method is from Reptile Class"). 
d) Create another class "Birds". Implement a method inside the class -- birdsInfo and System.out.println
("This method is from Birds Class"). 
e) Create another class "Dog". Implement a method inside the class -- dogInfo and System.out.println
("This method is from Dog Class"). 
f) Create another class "Snake". Implement a method inside the class -- snakeInfo and System.out.println
("This method is from Snake Class").
 g) Create another class "Robin". Implement a method inside the class -- robinInfo and System.out.println
 ("This method is from Robin Class"). 
 h) Create another class "BullDog". Implement a method inside the class -- bullDogInfo and System.out.println
 ("This method is from BullDog Class").
 i) Create another class "Cobra". Implement a method inside the class -- cobraInfo and System.out.println
 ("This method is from Cobra Class").
Now create a class "TestAnimal". Under the main method create an object from each class and call their own 
method by their own object. Now extends BullDog, Cobra, and Robin class and shows their hierarchy till Animal Class,
for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc.
An object Can call other methods if the class is extended, if yes, show all the possible calls. 
Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above. 
Also, show by java comments who is Parent class and who is child class. 
*/
package hw6Q3Inheritance;

//This is a Hierarchical Inheritance because more than one derived class are created from a single base class (Animal class)

public class Animal {

	public void animalInfo() { // Implement a method inside the class

		System.out.println("This method is from Animal Class");

	}

}
