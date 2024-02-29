package viikko7;

public class Student implements PrintInfo {
    private String name;
    private String id;
    

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }
}
