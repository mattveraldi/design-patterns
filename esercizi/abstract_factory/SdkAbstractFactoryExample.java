package esercizi.abstract_factory;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SdkAbstractFactoryExample {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("esercizi/abstract_factory/example.xml"));

        NodeList descriptions = doc.getElementsByTagName("description");
        for (int i = 0; i < descriptions.getLength(); i++) {
            System.out.println(descriptions.item(i).getTextContent());
        }
    }
}
