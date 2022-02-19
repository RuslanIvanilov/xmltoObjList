package ru.rwe.ru.rwe.employees.xml;

import org.apache.log4j.*;

import java.io.File;
import java.io.FileNotFoundException;

public class XmlFile extends File{
    public final File file;

    Logger log = LogManager.getLogger(this.getClass());

    public XmlFile(String fileName) {
        super(fileName);
        file = new File(fileName);

       if(! file.exists()){
           try {
               throw new FileNotFoundException(fileName);
           } catch (FileNotFoundException e) {
               log.error(e.getMessage());
           }
       }
    }



}
