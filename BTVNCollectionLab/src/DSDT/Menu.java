package DSDT;

import java.util.Scanner;

public class Menu {
    public void menu() {
        String name="", sdt="";
        ListDB dssdt = new ListDB();
        DB db = new DB(name, sdt);
        Scanner input = new Scanner(System.in);
        int value=0;
        db.name="Ha";db.sdt="456";
        dssdt.add(db);
        do{
            System.out.println("------------------MENU------------------");
            System.out.println("1. Kiểm tra tồn tại                     |");
            System.out.println("2. Thêm số điện thoại                   |");
            System.out.println("3. Hiển thị list số điện thoại          |");
            System.out.println("4. Tìm kiếm số điện thoại               |");
            System.out.println("5. Sửa số điện thoại                    |");
            System.out.println("0. Thoát khỏi chương tình               |");
            System.out.println("----------------------------------------");
            System.out.println("Nhập vào yêu cầu:");
            value = input.nextInt();
            input.nextLine();
            switch(value){
                case 1:
                    dssdt.check("123");
                    break;
                case 2:
                    System.out.println("Nhập name:"); String nameNew = input.nextLine();
                    input.nextLine();
                    System.out.println("Nhập số điện thoại:"); String sdtNew = input.nextLine();
                    input.nextLine();
                    DB db2 = new DB(nameNew, sdtNew);
                    if(sdtNew.equals(db.sdt)){
                        System.out.println("Danh bạ này đã tồn tại");
                    }else{
                        dssdt.add(db2);
                        System.out.println("Đã thêm vào Danh Bạ");
                        dssdt.printinfo();
                    }
                    break;
                case 3:
                    dssdt.printinfo();
                    break;
                case 4:
                    dssdt.searchDanhBa("Th");
                case 5:
                    dssdt.edit("123", "234");
                    break;
                default:
                    value =-1;
                    break;
            }
        }while(value>0);
    }
}
