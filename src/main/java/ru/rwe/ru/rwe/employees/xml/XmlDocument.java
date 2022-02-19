package ru.rwe.ru.rwe.employees.xml;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import org.w3c.dom.Document;

public class XmlDocument {

    private Document document = null;
    private Logger log = LogManager.getLogger(this.getClass());


    public XmlDocument(XmlFile file){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(file);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            log.error(e.getMessage());
        }
    }

    public Document getDocument(){ return document; }


}
