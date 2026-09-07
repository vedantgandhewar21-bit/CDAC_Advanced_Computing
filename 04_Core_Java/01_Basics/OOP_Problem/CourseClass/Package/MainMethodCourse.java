package Package;

public class MainMethodCourse {
 public static void main(String[] args) {
	 //Create Courses
	Course java = new Course("Java");
	Course Cpp = new Course("C++");
  
     // Change Commo capacity
	   Course.setMaxCapacity(3);
	//Enroll students
	   java.enrollStudent("Vedant");
	   java.enrollStudent("Rahul");
	   java.enrollStudent("Manish");
	   
	   //course is Ful
	   java.enrollStudent("joy");
	   
	   //unenroll Student 
	   java.unenrollStudent("Rahul");
	   
	   //Now there is one seat is available
	   java.enrollStudent("joy");
	   
 
 }
}
