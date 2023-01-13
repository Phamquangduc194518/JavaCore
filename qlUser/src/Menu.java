import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("Chọn chức năng : [1- 4]");
            System.out.println("Đăng ký tài khoản: ");
            int chon = input.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Thực hiện chức năng 1");
                    break;
                case 2:
                    System.out.println("Thực hiện chức năng 2");
                    break;
                case 3:
                    System.out.println("Thực hiện chức năng 3");
                    break;
                default:
                    System.out.println("Tạm biệt");
                    cont = false;
                    break;
            }
        } while (cont);
    }
}
