import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public void client() throws IOException {
        System.out.println("Client kết nối");
        Socket cl = new Socket("localhost",6666);
        DataInputStream in = new DataInputStream(cl.getInputStream());
        DataOutputStream out = new DataOutputStream(cl.getOutputStream());
        Scanner w = new Scanner(System.in);
        while(true){
            // truyền dữ liệu lên server
            String str = w.nextLine();
            out.writeUTF(str);
            if(str.equals("end")){
                break;
            }
            out.flush();
            // đọc dữ liệu từ server
            String str2 = in.readUTF();
            System.out.println("Server say: "+str2);
        }
        in.close();
        out.close();
        cl.close();
    }
}
