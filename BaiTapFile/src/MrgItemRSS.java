import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class MrgItemRSS {
    List<ItemRSS> ItemRSSs = new ArrayList<>();
    ItemRSS newS = null;

    public List<ItemRSS>readDataFrom(String path) {
        try {
            File file = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document xmlDocument = dBuilder.parse(file);
            xmlDocument.getDocumentElement().normalize();//sẽ nối các đoạn text gần kề lại với nhau.
            System.out.println("Root element :" + xmlDocument.getDocumentElement().getNodeName());
            NodeList list = xmlDocument.getElementsByTagName("item");
            System.out.println("----------------------------");
            for (int i = 0; i < list.getLength(); i++) {
                 newS = new ItemRSS();
                Node nNode = list.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    newS.setTitle(eElement.getElementsByTagName("title").item(0).getTextContent());
                    newS.setSummary(eElement.getElementsByTagName("description").item(0).getTextContent());
                    newS.setLinkImage(eElement.getElementsByTagName("link").item(0).getTextContent());
                    newS.setLinkHtml(eElement.getElementsByTagName("image").item(0).getTextContent());
                    newS.setDate(eElement.getElementsByTagName("pubDate").item(0).getTextContent());
                }
                ItemRSSs.add(newS);
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
        return ItemRSSs;
    }



    public void editFile(){

    }
}
