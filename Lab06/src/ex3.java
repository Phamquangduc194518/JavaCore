import java.io.*;
import java.util.Scanner;

public class ex3 {
    public void readData() throws IOException {
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        String url = "/home/hust/IdeaProjects/Lab06/src/file.txt";
        fileInputStream = new FileInputStream(url);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileInputStream.close();
    }
}



