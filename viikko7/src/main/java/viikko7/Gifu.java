package viikko7;

import java.util.ArrayList;

public class Gifu {
    private String university;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    

    public Gifu(String university){
        this.university = university;
    }


    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourse(int id){
        return null;
    }

    public ArrayList gerCourses(){
        return null;
    }

    public void listCourses(){

    }

    public void addStudent(Student student){

    }

    public Student getStudent(int id){
        return null;
    }

    public void listStudents(){

    }

    public void enrollStudent(Student student, Course course){

    }

    public ArrayList getEnrollmentsCourse(Course course){
        return null;
    }

    public ArrayList getEnrollmentsStudent(Student student){
        return null;
    }
}
