import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        MrgItemRSS a = new MrgItemRSS();
        List<ItemRSS> listIf=a.readDataFrom("/home/hust/IdeaProjects/BaiTapFile/src/rss.txt");
        for(ItemRSS list : listIf){
            System.out.println(list.printInfo());
        }
    }
}