import java.io.*;
import java.util.Scanner;

public class ex2 {
    public void fi() throws IOException {
        File f = new File("/home/hust/IdeaProjects/Lab06/src/file.txt");
        Scanner a = new Scanner(f);
//        String data = a.();
//        if(data != null){
//            System.out.println(data);
//            data = a.readLine();
        }



    public void editFile() throws IOException {
        FileWriter a = new FileWriter("/home/hust/IdeaProjects/Lab06/src/file.txt");
        a.write("Đỉnh");
        a.close();
    }
}
