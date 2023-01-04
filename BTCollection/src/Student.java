public class Student {
    private String name;
    private String mssv;
    private int age;
    private float mask;

    public Student(String name, int age, String mssv, float mask) {
        this.name = name;
        this.mssv = mssv;
        this.age = age;
        this.mask = mask;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMask() {
        return mask;
    }

    public void setMask(float mask) {
        this.mask = mask;
    }

    public String info(){
        return "name"+this.name + "age"+this.age;
    }
}
