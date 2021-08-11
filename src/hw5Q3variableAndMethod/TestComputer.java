package hw5Q3variableAndMethod;

public class TestComputer {
	/*
	 * Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want
	 * second outcome in console for your configuration. So, Total 2 outcome is
	 * expecting from the test class. Organize your code. Push in the github. Paste
	 * your github link below. (Please paste the whole question inside the multiple
	 * line comments between package and class)
	 */

	public static void main(String[] args) {
		Computer my = new Computer();
		my.Brand = "Apple";
		my.Model = "MacBook Air";
		my.OperatingSystem = "MacOS Mojave";
		my.price = 800;
		my.madeInUsa = false;
		my.grade = 'A';
		my.configuration();
		System.out.println("___________________________________________________________");

		Computer mydesktop = new Computer();
		mydesktop.Brand = "Hp";
		mydesktop.Model = "HP Pavilion";
		mydesktop.OperatingSystem = "Windows 10 ";
		mydesktop.price = 500;
		mydesktop.madeInUsa = true;
		mydesktop.grade = 'A';
		mydesktop.configuration();
		System.out.println("___________________________________________________________");

	}

}
