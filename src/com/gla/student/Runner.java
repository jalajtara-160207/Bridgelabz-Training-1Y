package com.gla.student;
import com.gla.student.Student;
import com.gla.student.Faculty;
public class Runner {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();
        s.displayStudentInfo("John Doe", 101);
        f.displayFacultyInfo("Dr. Smith", "Computer Science");
    }

}
