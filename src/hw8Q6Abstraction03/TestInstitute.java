/*Follow all the above hierarchy to inherit the methods.  

Now create a class TestInstitute.  

Then Instantiate ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool one by one.  

Call all the possible methods from ColumbiaUniversity , 
RockefellerUniversity, University, Hospital, 
MedicalSchool and NursingSchool.   */
package hw8Q6Abstraction03;

public class TestInstitute {

	public static void main(String[] args) {

		// ColumbiaUniversity
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.field();
		columbiaUniversity.teacher();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.caring();

		// RockefellerUniversity
		RockefellerUniversity rockefellerUniversity = new RockefellerUniversity();
		rockefellerUniversity.aeronauticalInfo();
		rockefellerUniversity.mechanicalLab();
		rockefellerUniversity.computerLab();
		rockefellerUniversity.hashCode();
		rockefellerUniversity.equals(rockefellerUniversity);
		rockefellerUniversity.toString();

		// University
		University university = (University) new ColumbiaUniversity();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		university.classSize();
		university.field();
		university.teacher();

		// Hospital
		Hospital hospital = (Hospital) new ColumbiaUniversity();
		hospital.emergencyRoom();
		hospital.surgeryRoom();
		hospital.cafeteria();
		hospital.morgue();
		College.studyRoom();

		// MedicalSchool
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		College.studyRoom();
		medicalSchool.aeronauticalInfo();
		medicalSchool.physics();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.statistics();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();

		// NursingSchool
		NursingSchool nursingSchool = new ColumbiaUniversity();
		College.studyRoom();
		nursingSchool.aeronauticalInfo();
		nursingSchool.physics();
		nursingSchool.mechanicalLab();
		nursingSchool.computerLab();
		nursingSchool.statistics();
		nursingSchool.hygiene();
		nursingSchool.caring();

	}

}
