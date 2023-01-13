import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public void output(){
        FileOutputStream a = null;
        try {
            String b = "Dang o day";
            a = new FileOutputStream("text.txt");
            a.write(b.getBytes());
            a.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
