import java.io.File;
import java.util.Objects;

public class ex1 {
    public void file() {
        File file= new File("/home/hust");
        File[] children = file.listFiles();{
            assert children != null;
            for (File child : children) {
                System.out.println(child);
            }
        }
    }


}


