import java.util.ArrayList;


public class ListStudent {
    private ArrayList<Student> list;

    public ListStudent() {
        this.list = new ArrayList<Student>();
    }

    public void addStudent(Student s){
        this.list.add(s);
    }

    public void Information(Student s){
        s.info();
    }
}
