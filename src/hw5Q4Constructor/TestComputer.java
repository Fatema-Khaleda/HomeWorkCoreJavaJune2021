
package hw5Q4Constructor;

public class TestComputer {

	public static void main(String[] args) {

		Computer object1 = new Computer();
		System.out.println("______________________________________________________");

		Computer object2 = new Computer("Apple", "MacBook Air ", " MacOS Mojave", 800, false, 'C');
		System.out.println("______________________________________________________");

		Computer object3 = new Computer("HP", "HP Pavillion", " Windows 10", 800, true, 'A');
		System.out.println("______________________________________________________");

		Computer object4 = new Computer("Apple");
		System.out.println("______________________________________________________");

		Computer object5 = new Computer("Apple", "MacBook Pro", "MacOS Retina");
		System.out.println("______________________________________________________");

		Computer object6 = new Computer("Lenovo", "Chromebook 3", "Windows 10", 1200, false);
		System.out.println("______________________________________________________");

	}

}
