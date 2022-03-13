package courses_in_semesters;

import course_and_semester.*;

public class CourseInASemester {
    private Course course;
    private Semester semester;

    // Constructor
    public CourseInASemester(Course courseName, Semester semesterTerm) //signature
    {
        //body, initialize the class properties
        this.course = courseName;
        this.semester = semesterTerm;
    }

    //getters and setters for Course
    public void setCourse(Course courseName) { course = courseName; }
    public Course getCourse() { return course; }

    //getters and setters for Semester
    public void setSemester(Semester semesterTerm) { semester = semesterTerm; }
    public Semester getSemester() { return semester; }

    //a method to return the information about the object
    public String toString()
    { return (course + ". It's offered in the " + semester + "."); }

    public static void main(String[] args) {
        Course c1 = new Course("OOP", 4.0);
        Course c2 = new Course("Research in NLP", 0.5);
        Semester s1 = new Semester("Spring", "2022");
        CourseInASemester cs1 = new CourseInASemester(c1, s1);
        System.out.println(cs1);
        CourseInASemester cs2 = new CourseInASemester(c2, s1);
        System.out.println(cs2);
    }

}


