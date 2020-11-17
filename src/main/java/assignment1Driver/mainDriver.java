package assignment1Driver;

import java.util.ArrayList;
import java.util.List;

import assignment1.*;
import assignment1.Module;


public class mainDriver {

	public static void main(String[] args) {
		// Students created
		Student s1 = new Student("Ryan", 21, "11/04/1999");
		Student s2 = new Student("Aisling", 21, "22/07/1999");
		Student s3 = new Student("Frank", 19, "14/02/2001");
		Student s4 = new Student("Daniel", 20, "20/12/1999");
		Student s5 = new Student("Niall", 22, "30/04/1998");
		Student s6 = new Student("Luke", 21, "01/08/1999");
		
		// Students added to lists for modules and course
		List<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(s1);
		studentList1.add(s2);
		studentList1.add(s3);
		studentList1.add(s4);
		studentList1.add(s5);
		studentList1.add(s6);
		
		List<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(s1);
		studentList2.add(s2);
		studentList2.add(s4);
		studentList2.add(s6);
		
		List<Student> studentList3 = new ArrayList<Student>();
		studentList3.add(s3);
		studentList3.add(s5);
		
		//Modules created and correct student list added to each
		Module softwareEng3 = new Module("Software Engineering 3", "CT417", studentList2);
		Module systemOnChip1 = new Module("System on Chip Design 1", "EE451", studentList1);
		Module Telecomms = new Module("Telecommunications Software Applications", "EE453", studentList1);
		Module machineLearning = new Module("Machine Learning", "CT4101", studentList2);
		
		//Modules added to each course list
		List<Module> courseModuleList1 = new ArrayList<Module>();
		courseModuleList1.add(softwareEng3);
		courseModuleList1.add(systemOnChip1);
		courseModuleList1.add(Telecomms);
		courseModuleList1.add(machineLearning);
		
		List<Module> courseModuleList2 = new ArrayList<Module>();
		courseModuleList2.add(systemOnChip1);
		courseModuleList2.add(Telecomms);
		
		//Courses created, taking in their module list and student list
		Course ece = new Course("Electronic and Computer Engineering", "28/09/2020", "07/06/2021", courseModuleList1, studentList2);
		Course eee = new Course("Electronic and Electrical Engineering", "28/09/2020","07/06/2021", courseModuleList2, studentList3);
		
		
		//Printing of information
		System.out.println("Course Name: "+ece.getCourseName());
		System.out.println("Modules:");
		for(Module m : ece.getModules()) {
			System.out.println(m.getName());
		}
		System.out.println("\nCourse Name: "+eee.getCourseName());
		System.out.println("Modules:");
		for(Module m : eee.getModules()) {
			System.out.println(m.getName());
		}
		
		System.out.println("\nStudents: ");
		for(Student s : studentList1) {
			System.out.println("Name: " + s.getName());
			System.out.println("Username: "+s.getUsername());
			System.out.println("Modules: ");
			for(String moduleName : s.getModules()) {
				System.out.println(moduleName);
			}
			System.out.println("Courses: ");
			for(String courseName : s.getCourses()) {
				System.out.println(courseName);
			}
			System.out.println();
		}
	}

}
