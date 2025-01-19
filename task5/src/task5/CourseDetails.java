package task5;
import java.util.*;
public interface CourseDetails {
	String getCourseId();
    String getCourseName();
    void enrollStudent(StudentDetails student);
	List<StudentDetails> getEnrolledStudents();
	

}
