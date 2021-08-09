package hw4Q3JavaVariablesConstructorAndMethod;

public class VeribleDeclareForMyProfile {
	
	public static void main(String[] args) {
		
		MyProfile fatema = new MyProfile() ;
		fatema.name = "Fatema Khaleda";
		fatema.sex = 'F';
		fatema.age = 28;
		fatema.houseNumber = 524;
		fatema.HouseDirection = "Mcdonald ave, Brooklyn, Ny";
		fatema.zipCode = 11218;
		fatema.houseRent = 1450;
		fatema.annual_salary = 50000;
		fatema.education_level = "Associate Degree";
		fatema.gpa = 3.65f;
		fatema.height = 65;
		fatema.inUSA = true;
		fatema.yearsOfLiveInUsa = 9;
		
		fatema.myProfile();
		System.out.println("________________________________________________");
		
		
		MyProfile nayon = new MyProfile() ;
		nayon.name = "Nayon Sarker";
		nayon.sex = 'M';
		nayon.age = 27;
		nayon.houseNumber = 8540;
		nayon.HouseDirection = "Jamaica ave, Queens, Ny";
		nayon.zipCode = 11419;
		nayon.houseRent = 1350;
		nayon.annual_salary = 70000;
		nayon.education_level = "Associate Degree";
		nayon.gpa = 3.85f;
		nayon.height = 68;
		nayon.inUSA = true;
		nayon.yearsOfLiveInUsa = 5;
		
		nayon.myProfile();
		System.out.println("________________________________________________");
		
		
	}

}
