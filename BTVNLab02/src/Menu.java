import java.util.Scanner;

public class Menu {
    void menu() {
        Scanner input = new     Scanner(System.in);
        int k = 1;
        do {
                System.out.println("Chọn giá trị từ 1-7 để thực hiện bài tập: ");
                int select = input.nextInt();
                switch (select) {
                    case 1:
                    Scanner a = new Scanner(System.in);
                    System.out.println("Thực hiện bài 1");
                    System.out.println("Nhập vào số n(n>3 && n<50): ");
                    int n = a.nextInt();
                    Sum sum = new Sum();
                    if (n > 3 && n < 50) {
                        sum.tong(n);
                    } else System.out.println("Bạn nhập sai, nhập lại!");
                    break;
                case 2:
                    Scanner b = new Scanner(System.in);
                    System.out.println("Nhập vào số n(n>=5 && n<=20): ");
                    int n2 = b.nextInt();
                    Sum sum2 = new Sum();
                    if (n2 >= 5 && n2 <= 20) {
                        sum2.tong2(n2);
                    } else System.out.println("Bạn nhập sai, nhập lại!");
                    break;
                case 3:
                    Scanner c = new Scanner(System.in);
                    System.out.println("Nhập vào số n(n>=7): ");
                    int n3 = c.nextInt();
                    Sum sum3 = new Sum();
                    if (n3 >= 7) {
                        sum3.tong3(n3);
                    } else System.out.println("Bạn nhập sai, nhập lại!");
                    break;
                case 4:
                    Scanner d = new Scanner(System.in);
                    System.out.println("Nhập vào số n(n>9): ");
                    int n4 = d.nextInt();
                    Sum sum4 = new Sum();
                    if (n4 > 9) {
                        sum4.tong4(n4);
                    } else System.out.println("Bạn nhập sai, nhập lại!");
                    break;
                case 5:
                    Scanner e = new Scanner(System.in);
                    System.out.println("Nhập vào số n(n>=2): ");
                    int n5 = e.nextInt();
                    Sum sum5 = new Sum();
                    if (n5 >= 2) {
                        sum5.tong5(n5);
                    } else System.out.println("Bạn nhập sai, nhập lại!");
                    break;
                case 6:
                    Scanner f = new Scanner(System.in);
                    System.out.println("Nhập vào số n(n>6): ");
                    int n6 = f.nextInt();
                    Sum sum6 = new Sum();
                    if (n6 > 6) {
                        sum6.tong6(n6);
                    } else System.out.println("Bạn nhập sai, nhập lại!");
                    break;
                case 7:
                    Scanner g = new Scanner(System.in);
                    System.out.println("Nhập vào số n(n>=1): ");
                    int n7 = g.nextInt();
                    Sum sum7 = new Sum();
                    if (n7 >= 1) {
                        sum7.tong7(n7);
                    } else System.out.println("Bạn nhập sai, nhập lại!");
                    break;
                default:
                    k = k - 2;
                    System.out.println("Kết thúc chương trình");
            }
        } while (k > 0);
    }
}
