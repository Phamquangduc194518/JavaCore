import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class MrgItemRss {
    private List<ItemRss> arr;

    public  MrgItemRss(){
        this.arr=new ArrayList<>();
    }

    public void printAll() {
        for (ItemRss rss : arr) {
            rss.printfIfo();
        }
    }
    public void readData()  {
        String file ="filename.txt";
        try {
            RandomAccessFile rd = new RandomAccessFile(file, "r");
            while(true) {
                String line = rd.readLine();
                if (line == null) {
                    break;
                }
                line = rd.readLine();
                String title = null;
                if (line.equals("<title>")) {
                    title = rd.readLine();
                    rd.readLine();
                } else {
                    title = line.replace("<title>", "");
                    title = title.replace("</title>", "");
                }
                line = rd.readLine();
                String description = null;
                if (line.equals("<description>")) {
                    line = rd.readLine();
                    description = rd.readLine();
                    rd.readLine();
                    rd.readLine();
                } else {
                    description = line.replace("<description><![CDATA[", "");
                    description = description.replace("]]></description>", "");
                }

                if (description.contains("/>")) {
                    description = description.replace("/>", "");
                }
                rd.readLine();
                String link = rd.readLine();
                rd.readLine();
                String date = rd.readLine();
                date = date.replace("<pubDate>", "");
                date = date.replace("</pubDate>", "");
                rd.readLine();
                String image = rd.readLine();
                rd.readLine();
                rd.readLine();
                title = new String(title.getBytes("ISO-8859-1"), "UTF-8");
                description = new String(description.getBytes("ISO-8859-1"), "UTF-8");
                arr.add(new ItemRss(title, description,image, link, date));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
