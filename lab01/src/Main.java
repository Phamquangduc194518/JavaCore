public class Main {
    public static void main(String[] args) {
        PTB1 p1= new PTB1();
        p1.a= 10;
        p1.b= p1.a;
        p1.tinh();

        System.out.println("x = " +p1.x);
    }
}