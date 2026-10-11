package JavaPart2Assignment;

class P052_Course {

	String courseName;
	int enrollments;
	static int maxCapacity = 60;
	String[] enrolledStudents;

	P052_Course(String courseName) {
		this.courseName = courseName;
		this.enrollments = 0;
		this.enrolledStudents = new String[maxCapacity];
	}

	String[] enrolledStudent = new String[maxCapacity];

	static void setMaxCapacity(int maxCapacity) {
		P052_Course.maxCapacity = maxCapacity;
	}

	public void enrollStudent(String studentName) {
		enrolledStudent[enrollments] = studentName;
		enrollments++;
	}

	public void unenrollStudent(String studentName) {
		int i = 0;
		while (i < enrolledStudent.length) {
			if (enrolledStudent[i] == studentName) {
				enrolledStudent[i] = null;
			}
			i++;
		}
		enrollments--;
	}

}
