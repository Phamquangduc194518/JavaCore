import java.util.Scanner;

public class Menu {
    public void menu() {
        ListStudent dssv = new ListStudent();
        Scanner input = new Scanner(System.in);
        int value=0;
        do{
            System.out.println("------------------MENU------------------");
            System.out.println("1. Thêm sinh viên vào danh sách         |");
            System.out.println("2. In danh sách sinh viên               |");
            System.out.println("3. Kiểm tra danh sách có rỗng hay không |");
            System.out.println("4. Lấy ra số lượng sv                   |");
            System.out.println("5. Làm rỗng danh sách sinh viên         |");
            System.out.println("7. Kiểm tra tồn tại sv theo mssv        |");
            System.out.println("8. Tìm sv = tên nhập từ bàn phím        |");
            System.out.println("9. Xuất ds sv có điểm từ cao -> thấp    |");
            System.out.println("0. Thoát khỏi chương tình               |");
            System.out.println("----------------------------------------");
            System.out.println("Nhập vào yêu cầu:");
            value = input.nextInt();
            input.nextLine();
            switch(value){
                case 1:
                    System.out.println("Nhập name:"); String name = input.nextLine();
                    System.out.println("Nhập age:"); int age = input.nextInt();
                    input.nextLine();
                    System.out.println("Nhập mssv:"); String mssv = input.nextLine();
                    System.out.println("Nhập mask:"); float mask = input.nextFloat();
                    Student student1= new Student(name, age, mssv, mask);
                    dssv.addStudent(student1);
                    break;
                case 2:


            default:
                value =-1;
                break;
            }
        }while(value>0);
    }
}
