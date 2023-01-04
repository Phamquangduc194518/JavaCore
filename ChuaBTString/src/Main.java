import com.t3h.btstring.DemoList;
import com.t3h.btstring.Student;
import com.t3h.btstring.StudentManager;

public class Main {
    public static void main(String[] args) {
        DemoList demoNumbers = new DemoList();
        demoNumbers.testAdd(4);
        demoNumbers.testAdd(6);
        demoNumbers.testAdd(2);
        demoNumbers.testAdd(8);
        demoNumbers.testAdd(7);
        demoNumbers.testAdd(9);

        demoNumbers.sortIncrease();

        demoNumbers.printAllNumber();


        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student("Nam", 20, 10));
        studentManager.addStudent(new Student("Ha", 21, 5));
        studentManager.addStudent(new Student("Linh", 19, 8));
        studentManager.addStudent(new Student("Chi", 22, 1));
        studentManager.addStudent(new Student("Bach", 25, 9));
        studentManager.addStudent(new Student("My", 8, 6));
        studentManager.addStudent(new Student("Tien", 2, 6));

        studentManager.sortIncreaseByAge();
        studentManager.printAllStudent();
        System.out.println("----------------------------------------");
        studentManager.sortByScore();
        studentManager.printAllStudent();

    }
}