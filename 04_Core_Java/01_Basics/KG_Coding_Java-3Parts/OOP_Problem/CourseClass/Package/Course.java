package Package;

import java.util.ArrayList;

class Course {
	// instance Varaible
	String courseName;
	ArrayList<String> enrolledStudents;

	// Static Varaible
	static int maxCapacity = 60;

	// Constructor
	Course(String courseName) {
		this.courseName = courseName;
		this.enrolledStudents = new ArrayList<>();
	}

	// Instance Method
	public void enrollStudent(String studentName) {

		if (enrolledStudents.size() < maxCapacity) {
			enrolledStudents.add(studentName);
			System.out.println(studentName + " enrolled in " + courseName);
		} else {
			System.out.println("Course is Full.Cannot enroll " + studentName);
		}
	}

	public void unenrollStudent(String studentName) {

		if (enrolledStudents.remove(studentName)) {

			System.out.println(studentName + " unenrolled from " + courseName);

		} else {

			System.out.println(studentName + " is not enrolled in " + courseName);
		}
	}

	// static Method
	public static void setMaxCapacity(int capacity) {
		maxCapacity = capacity;
		System.out.println("Maximum Capacity change to " + maxCapacity);
	}
}
