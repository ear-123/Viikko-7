package viikko7;

public class Course implements PrintInfo {
    private int maxNumberOfStudents;
    private String name;
    private String id;

    public Course(int maxNumberOfStudents, String name, String id){
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return null;
    }

    public String getId(){
        return null;
    }
}
