package school;

import course_and_semester.Course;
import course_and_semester.Semester;
import courses_in_semesters.CourseInASemester;
import java.util.ArrayList;

public class School {

    private String name;
    private ArrayList<CourseInASemester> coursesOffered;

    //Constructor
    public School(String name) {
        this.name = name; // name of the school
        coursesOffered = new ArrayList<CourseInASemester>();
    }

    public void addNewcourses(CourseInASemester cs) {
        coursesOffered.add(cs);
    }

    public String getAllCourses() {
        StringBuffer sb = new StringBuffer();
        for (CourseInASemester cs: coursesOffered)
        {
            sb.append("\t\t" + cs + "\n");
        }
        return sb.toString();
    }
    public String toString(){
        return name + ": \n\tWe offer the following courses:\n" +
                getAllCourses();
    }

    public static void main(String[] args) {
        School s = new School("New College of Florida");
        Course c1 = new Course("OOP", 4.0);
        Course c2 = new Course("Research in NLP", 0.5);
        Semester s1 = new Semester("Spring", "2022");
        Semester s2 = new Semester("Fall", "2022");
        CourseInASemester cs1 = new CourseInASemester(c1, s1);
        CourseInASemester cs2 = new CourseInASemester(c2, s1);
        CourseInASemester cs3 = new CourseInASemester(c1, s2);
        CourseInASemester cs4 = new CourseInASemester(c2, s2);
        s.addNewcourses(cs1);
        s.addNewcourses(cs2);
        s.addNewcourses(cs3);
        s.addNewcourses(cs4);
        System.out.println(s);
    }

}
