package hw7Q3Encapsulation01;

public class TestEmployeeInfo {

	public static void main(String[] args) {

		Employee employeeInfo = new Employee();
		employeeInfo.setName("Fatema Khaleda");
		employeeInfo.setAge(28);
		employeeInfo.setSex('F');
		employeeInfo.setUsCitizen(true);

		System.out.println("Employee Full Name:" + employeeInfo.getName() + "\n Employee Age:" + employeeInfo.getAge()
				+ "\n Employee Sex: " + employeeInfo.getSex() + "\n Is this Employee Cinizen of USA ?  "
				+ employeeInfo.isUsCitizen());

	}

}