/*Now create a class "TestAnimal". Under the main method create an object from each class and call their own 
 method by their own object. Now extends BullDog, Cobra, and Robin class and shows their hierarchy till Animal Class,
 for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc.
 An object Can call other methods if the class is extended, if yes, show all the possible calls. 
 Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above. 
 Also, show by java comments who is Parent class and who is child class. 
*/

package hw6Q3Inheritance;

public class TestAnimal {
	// here Parents class is "Animal". Animal is Parents class of mammal, reptile,
	// birds
	// mammal, reptile, birds is child class of parents class " Animal"

	// Mammal is parents class Dog. and Dog is child class of Mammal.
	// Dog is parents class of Bulldog. and bulldog is child class of dog.

	// Reptile is parents class of snake. and snake is child class of Reptile.
	// snake is parents class of cobra. and cobra is child class of snake.

	// bird is parents class of robin. and robin is child class of bird.

	public static void main(String[] args) {

		// multiple inheritance is not allowed in Java
		// classes are instantiated below

		// (a)
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("___________________________________");

		// b
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		// Yes. An object Can call other methods if the class is extended
		System.out.println("___________________________________");

		// c
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		// Yes. An object Can call other methods if the class is extended
		System.out.println("___________________________________");

		// d
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		// Yes. An object Can call other methods if the class is extended
		System.out.println("___________________________________");

		// e
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		// Yes. An object Can call other methods if the class is extended
		System.out.println("___________________________________");

		// f
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		// Yes. An object Can call other methods if the class is extended
		System.out.println("___________________________________");

		// g
		Robin robin = new Robin();
		robin.narobinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		// Yes. An object Can call other methods if the class is extended
		System.out.println("___________________________________");

		// h
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		// Yes. An object Can call other methods if the class is extended
		System.out.println("___________________________________");

		// i
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		// Yes. An object Can call other methods if the class is extended
		System.out.println("___________________________________");

	}

}
