package course_and_semester;

public class Semester{
    String name;
    String year;
    public Semester(String name, String year){
        this.name = name;
        this.year = year;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getYear(){
        return this.year;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String toString(){
        return this.name + ", " + this.year;
    }
    public static void main(String[] args){
        Semester s1 = new Semester("Spring", "2022");
        System.out.println(s1);
    }
}
