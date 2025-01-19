package task5;

public class EnrollmentManger implements Enrollment {

	@Override
	public void enroll(StudentDetails student, CourseDetails course) {
		// TODO Auto-generated method stub
		student.enrollInCourse(course);
        course.enrollStudent(student);
	}

}