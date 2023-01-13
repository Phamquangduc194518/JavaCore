import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Demo {
    public void downloadFile(String link) {
        try {
            int index = link.lastIndexOf("/") + 1;
            String name = link.substring(index);
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            byte b[] = new byte[1024];
            OutputStream out = new FileOutputStream(name);
            InputStream in = conn.getInputStream();
            int total = conn.getContentLength();
            int len = in.read(b);
            int current = len;
            while (len > -1) {
                out.write(b, 0, len);
                System.out.println("current: " + 100 * current / total);
                len = in.read(b);
                current += len;
            }
            in.close();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
