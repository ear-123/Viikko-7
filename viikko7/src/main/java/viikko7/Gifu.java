package viikko7;

import java.util.ArrayList;

public class Gifu {
    private String university;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Enrollment> enrollments = new ArrayList<>();

    public Gifu(String university){
        this.university = university;
    }


    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourse(int id){
        return courses.get(id);
    }

    public ArrayList<Course> getCourses(){
        return courses;
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
        return students.get(id);
    }

    public void listStudents(){
        int i = 0;
        for (Student student : students) {
            System.out.println(i + ") " + student.getId() + " " + student.getName());
            i++;
        }
    }

    public void enrollStudent(Student student, Course course){
        enrollments.add(new Enrollment(student, course));
    }

    public ArrayList<Enrollment> getEnrollmentsCourse(Course course){
        ArrayList<Enrollment> returnEnrollments = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getCourse() == course) {
                returnEnrollments.add(enrollment);
            }
        }
        return returnEnrollments;
    }

    public ArrayList<Enrollment> getEnrollmentsStudent(Student student){
        return null;
    }
}
