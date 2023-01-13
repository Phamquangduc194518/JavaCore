import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class InetAddress {
    public void inet(){
        try {
            java.net.InetAddress in = java.net.InetAddress.getByName("www.codejava.net");
            System.out.println(in.getHostName());
            System.out.println(in.getHostAddress());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
