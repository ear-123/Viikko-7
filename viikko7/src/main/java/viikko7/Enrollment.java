package viikko7;

public class Enrollment {
    private int grade;
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course){
        this.grade = -1;
        this.student = student;
        this.course = course;
    }

    public void gradeCourse(int grade){
        this.grade = grade;
    }

    public Student getStudent(){
        return this.student;
    }

    public Course getCourse(){
        return this.course;
    }

    public int getGrade(){
        return this.grade;
    }
}
