package PExercises;
import PUniversity.course;
import PUniversity.enrollment;
import PUniversity.student;

public class mainuniversity {
    public static void main(String[] args){
        course course = new course();
        course.courseld = 12345;
        course.courseName = "Python course";
        student student = new student();
        student.studentld = 1234;
        student.name = "luis";
        enrollment enrollment = new enrollment();
        enrollment.student = student;
        enrollment.student.name = "Martin";
        enrollment.course = course;

        System.out.println("Student ID: " + enrollment.student.studentld + ", Name: " + enrollment.student.name);
        System.out.println("Course ID: " + enrollment.course.courseld + ", Name: " + enrollment.course.courseName);
    }
}
