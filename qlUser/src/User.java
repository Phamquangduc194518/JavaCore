import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
     List<Account> list= new ArrayList<>();
     String file = "csdl.txt";
     public void SignUp(){
         Account ac = new Account();
         Scanner in = new Scanner(System.in);
         System.out.println("--------Đăng ký---------");
         System.out.println("Nhập vào tên đăng nhập:");
         ac.setTk(in.nextLine());
         System.out.println("Nhập vào mật khẩu:");
         ac.setMk(in.nextLine());

         System.out.println("Nhập vào tên tài khoản:");
         ac.setName(in.nextLine());

         System.out.println("Nhập vào số điện thoại:");
         ac.setnPhone(in.nextLine());

         list.add(ac);
         try {
             FileOutputStream out = new FileOutputStream(file, true);
             ObjectOutputStream outOj = new ObjectOutputStream(out);
             outOj.writeObject(ac.print());
             outOj.flush();
             out.close();
             outOj.close();
         }catch(IOException e){
             throw new RuntimeException(e);
         }
     }

     public void SignIn(){
         try {
             FileInputStream is = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(is);
             System.out.println("mk"+ois.readObject());
             is.close();
             ois.close();
         }catch(IOException | ClassNotFoundException e){
             throw new RuntimeException(e);
         }
     }
}
