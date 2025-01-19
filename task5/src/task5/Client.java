package task5;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails student1 = new Student("S001", "Angelina");
        StudentDetails student2 = new Student("S002", "Angelina");
        
        CourseDetails course1 = new Courses("C001", "Mathematics");
        CourseDetails course2 = new Courses("C002", "Physics");
        
        Enrollment enrollmentManager = new EnrollmentManger();
        
        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student2, course2);
        enrollmentManager.enroll(student1, course2); 
        
        System.out.println("\nEnrolled students in " + course1.getCourseName() + ":");
        for (StudentDetails student : course1.getEnrolledStudents()) {
            System.out.println(student.getStudentName());
        }

        System.out.println("\nEnrolled students in " + course2.getCourseName() + ":");
        for (StudentDetails student : course2.getEnrolledStudents()) {
            System.out.println(student.getStudentName());
        }
	}

}