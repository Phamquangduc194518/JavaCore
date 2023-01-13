import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public void server() throws IOException {
        System.out.println("Bắt đầu mở socket, chat đi: ");
        ServerSocket ss = new ServerSocket(6666);
        Socket cl = ss.accept();
        DataInputStream in = new DataInputStream(cl.getInputStream());
        DataOutputStream out = new DataOutputStream(cl.getOutputStream());
        Scanner w = new Scanner(System.in);
        while(true){
            // doc du lieu từ client truyeb đến
            String str = in.readUTF();
            if(str.equals("end")){
                break;
            }
            System.out.println("Client say: "+str);
            // truyền dữ liệu từ server đến client
            String str2 = w.nextLine();
            out.writeUTF(str2);
            out.flush();
        }
        in.close();
        cl.close();
        cl.close();
        ss.close();

    }
}
