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
        int i = 0;
        for (Course course : courses) {
            System.out.println(i + ") " + course.getId() + " " + course.getName());
            i++;
        }

    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudent(int id){
        return null;
    }

    public void listStudents(){
        int i = 0;
        for (Student student : students) {
            System.out.println(i + ") " + student.getId() + " " + student.getName());
            i++;
        }
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
