import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a =n.nextInt();
        Scanner m = new Scanner(System.in);
        int b =n.nextInt();
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++) {
                System.out.println((i * j));

            }
    }
}