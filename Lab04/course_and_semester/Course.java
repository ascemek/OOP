package course_and_semester;

public class Course {
    private String title;
    private Double credit;
    public Course(String title, Double credit){
        this.title = title;
        this.credit = credit;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String toString(){
        return title + " is a course with " + credit + " credit";
    }
    // note: we should test every class we define
    public static void main(String[] args) {
        Course c1 = new Course("OOP", 4.0);
        System.out.println(c1);
        Course c2 = new Course("SE", 4.0);
        System.out.println(c2);
    }
}